package threads.multiThreadedHelloWorld;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1 " + Thread.currentThread().getName());
        System.out.println("2");

        // 1. Create an object of the task
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        // helloWorldPrinter.run();

        // 2. Create a thread
        Thread t = new Thread(helloWorldPrinter);

        // 3. Start the thread
        t.start();

        Thread.sleep(200);

        System.out.println("3");
        System.out.println("4 " + Thread.currentThread().getName());
    }
}
