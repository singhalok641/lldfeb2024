package threads.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);

        ExecutorService executorService = Executors.newCachedThreadPool();

        // We want 3 producers
        for(int i=0;i<3;i++){
            Producer p = new Producer(store, i+1);
            executorService.execute(p);
        }

        // We want 100 consumers
        for(int i=0;i<100;i++){
            Consumer consumer = new Consumer(store, i+1);
            executorService.execute(consumer);
        }
    }
}
