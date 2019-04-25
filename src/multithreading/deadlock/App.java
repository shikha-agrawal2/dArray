package multithreading.deadlock;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        runner.finished();
    }
}
