package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);

        MyThread thread1 = new MyThread(sem, "A");
        MyThread thread2 = new MyThread(sem, "B");
        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

    }
}

class Shared{
    static int count =0;
}

class MyThread extends Thread {
    Semaphore sem ;
    String threadName;
    public MyThread(Semaphore sem, String a) {
        this.sem = sem;
        this.threadName = a;
    }

    @Override
    public void run() {
        if(this.threadName.equals("A")){
            System.out.println("Starting " + threadName);
            // First, get a permit.
            System.out.println(threadName + " is waiting for a permit.");

            // acquiring the lock
            try {
                sem.acquire();

                for(int i =0; i<5; i++){
                    Shared.count++;
                    System.out.println(threadName + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread B to execute
                    Thread.sleep(10);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sem.release();
        }
        else if(this.threadName.equals("B")){
            // First, get a permit.
            System.out.println(threadName + " is waiting for a permit.");

            // acquiring the lock
            try {
                sem.acquire();
                System.out.println(threadName + " gets a permit.");
                for(int i=0; i < 5; i++)
                {
                    Shared.count--;
                    System.out.println(threadName + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread A to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Release the permit.
            System.out.println(threadName + " releases the permit.");
            sem.release();

        }
    }
}
