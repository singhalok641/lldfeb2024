package threads.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private int producerNumber;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Store store, int producerNumber,
                    Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerNumber = producerNumber;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }


    @Override
    public void run() {
        while(true){
            try {
                produceItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void produceItem() throws InterruptedException {
        producerSemaphore.acquire();
//        Thread.sleep(20);
        store.addItem(producerNumber);
        consumerSemaphore.release();
    }
}
