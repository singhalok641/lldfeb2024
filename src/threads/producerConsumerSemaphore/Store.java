package threads.producerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    Queue<Object> items;

    public Store(){
        items = new ConcurrentLinkedQueue<>();
    }

    public void addItem(int id){
        items.add(new Object());
        System.out.println("Item Added. Size is: " + items.size() + " By: " + id);
    }

    public void removeItem(int id){
        items.remove();
        System.out.println("Item Removed. Size is: " + items.size() + " By: " + id);
    }

    public Queue<Object> getItems(){
        return items;
    }

}
