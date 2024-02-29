package threads.printOneToHundredUsingThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ExecutorService executorService1 = Executors.newCachedThreadPool();

        for(int i=1; i<=100 ;i++){

            if(i == 50){
                System.out.println("WAIT");
            }

            NumberPrinter numberPrinter = new NumberPrinter(i);

            executorService.execute(numberPrinter);
        }
    }
}
