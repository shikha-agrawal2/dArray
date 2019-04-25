package multithreading.reentrantLocks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private void increment(){
        for(int i=0; i< 10000; i++){
            count++;
        }
    }
    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("Waiting...");
        condition.await();

        System.out.println("Woken up");  //Aftre condition.signal
        try {
            increment();
        }finally {
            lock.unlock();
        }
    }
    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();

        System.out.println("Press the return key!");
        new Scanner(System.in).nextLine();
        System.out.println("Got the return key!");
        condition.signal();
        try {
            increment();
        }finally {
            lock.unlock();   //After condition.signal, this line is important as otherwise first thread will not get lock
        }
    }
    public void finished(){
        System.out.println("Count is: "+ count);
    }
}
