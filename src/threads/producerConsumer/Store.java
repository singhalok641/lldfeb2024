package threads.producerConsumer;

public class Store {
    private int itemsCount = 0;
    private int maxItemsCount;

    public Store(int maxItemsCount){
        this.maxItemsCount = maxItemsCount;
    }

    // cmd +n on mac / ctrl + n on windows

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) throws Exception {
        System.out.println(itemsCount);
        if(itemsCount > maxItemsCount){
            throw new Exception("Items count gone crazy: " + itemsCount);
        }
        this.itemsCount = itemsCount;
    }

    public int getMaxItemsCount() {
        return maxItemsCount;
    }

    public void setMaxItemsCount(int maxItemsCount) {
        this.maxItemsCount = maxItemsCount;
    }
}
