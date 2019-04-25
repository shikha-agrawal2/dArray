package multithreading.deadlock2ndexample;

public class App {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
       // thread1.join();
        //thread2.join();

    }

    static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1");
                System.out.println("Thread 1: Waiting for lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Holding lock1 and lock2");
                }
            }
        }
    }
    static class Thread2 extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2");
                System.out.println("Thread 2: Waiting for lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2: Holding lock1 and lock2");
                }
            }
        }
    }
}


