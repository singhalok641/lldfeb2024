package lambdas.adderSubtractorMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Runnable adderRunnable = ()->{
            for(int i=1;i<=10000;i++){
                lock.lock();
                count.value += i;
                lock.unlock();
            }
        };
        Thread t1 = new Thread(adderRunnable);

        Runnable subtractorRunnable = ()->{
            for(int i=1;i<=10000;i++){
                lock.lock();
                count.value -= i;
                lock.unlock();
            }
        };
        Thread t2 = new Thread(subtractorRunnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
