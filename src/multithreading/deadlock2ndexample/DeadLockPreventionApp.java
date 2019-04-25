package multithreading.deadlock2ndexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockPreventionApp {
    public static Lock lock1 = new ReentrantLock();
    public static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
        // thread1.join();
        //thread2.join();

    }
    private static void acquireLock(Lock lock1, Lock lock2) {
        boolean alock1 = false;
        boolean alock2 = false;
        try {
            alock1 =lock1.tryLock();
            alock2= lock2.tryLock();
        } finally {
            if(alock1 && alock2) return;
            if(alock1 && !alock2) lock1.unlock();
            if(alock2 && !alock1) lock2.unlock();
        }

    }

    static class Thread1 extends Thread {
        public void run() {
            System.out.println("Waiting for lock1 and lock2");
            try {
                acquireLock(lock1, lock2);
                System.out.println("Thread 1: Acquired lock 1 and lock2");
            }finally {
                lock1.unlock();
                lock2.unlock();
            }

        }


    }

    static class Thread2 extends Thread {
        public void run() {
            System.out.println("Waiting for lock1 and lock2");
            try {
                acquireLock(lock1, lock2);
                System.out.println("Thread 2: Acquired lock 1 and lock2");
            }finally {
                lock1.unlock();
                lock2.unlock();
            }

        }
    }
}
