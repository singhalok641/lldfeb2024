package threads.producerConsumer;

public class Producer implements Runnable{
    private Store store;
    private int producerNumber;

    public Producer(Store store, int producerNumber) {
        this.store = store;
        this.producerNumber = producerNumber;
    }


    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if(store.getItemsCount() < store.getMaxItemsCount()){
                        System.out.println("Producing a new item by producer #: " + producerNumber);
                        try {
                            store.setItemsCount(store.getItemsCount() + 1);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        }
    }
}
