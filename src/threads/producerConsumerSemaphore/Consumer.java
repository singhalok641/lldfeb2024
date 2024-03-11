package threads.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private int consumerNumber;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Store store, int consumerNumber,
             Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.store = store;
        this.consumerNumber = consumerNumber;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void consumeItem() throws InterruptedException {
        consumerSemaphore.acquire();
//        Thread.sleep(20);
        store.removeItem(consumerNumber);
        producerSemaphore.release();
    }
}
