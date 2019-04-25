package multithreading;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class DeadlockProcess {
    ArrayList<Integer> list = new ArrayList<>();
    CountDownLatch latch;

    public DeadlockProcess(CountDownLatch latch) {
        this.latch = latch;
    }

    public void produce() throws InterruptedException {
        synchronized (this){
           // list.add(1);
            latch.await();
            System.out.println(Thread.currentThread().getName()+"acquired this lock"+"require list lock");
            synchronized (list){
                System.out.println(Thread.currentThread().getName()+"acquired lock of list");
            }

        }

    }
    public void consume() throws InterruptedException {
        synchronized (list){
            latch.countDown();
            //list.remove(0);
            System.out.println(Thread.currentThread().getName()+"acquired lock of list");
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"acquired lock of this");
            }
        }
    }

}

class App{
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        DeadlockProcess p = new DeadlockProcess(latch);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

    }
}


