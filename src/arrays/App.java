package arrays;
//Print 1-100 using 4 threads eg thread 1 will print 1, thread 2 -2 thread 3-3 thread 4-4 and then again thread 1-5 and so on
public class App {
    public static void main(String[] args) {
        PrintSequence p1 = new PrintSequence(1);
        PrintSequence p2 = new PrintSequence(2);
        PrintSequence p3 = new PrintSequence(3);
        PrintSequence p4 = new PrintSequence(0);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}
class PrintSequence implements Runnable {
    int max = 100;
    static int num = 1;
    int r;
    static Object lock = new Object();

    PrintSequence(int r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (num <= max) {
            synchronized (lock) {
                while (num % 4 != r) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ":" + num);
                num++;
                lock.notifyAll();

            }
        }
    }
}
