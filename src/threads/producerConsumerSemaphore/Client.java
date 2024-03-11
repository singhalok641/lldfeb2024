package threads.producerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        ExecutorService executorService = Executors.newCachedThreadPool();

        // We want 3 producers
        for(int i=1;i<=10;i++){
            Producer p = new Producer(store, i+1, producerSemaphore, consumerSemaphore);
            executorService.execute(p);
        }


        // We want 100 consumers
        for(int i=1;i<=20;i++){
            Consumer consumer = new Consumer(store, i+1, producerSemaphore, consumerSemaphore);
            executorService.execute(consumer);
            System.out.println("Consumer created");
        }
    }
}