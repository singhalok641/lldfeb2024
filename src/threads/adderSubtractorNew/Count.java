package threads.adderSubtractorNew;

public class Count {
    private int value;

    public synchronized void incrementValue(int i){
        this.value += i;
    }

    public int getValue(){
        return this.value;
    }
}
