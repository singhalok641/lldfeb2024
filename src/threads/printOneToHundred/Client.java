package threads.printOneToHundred;

public class Client {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i == 5 || i == 50 || i == 99){
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }

}
