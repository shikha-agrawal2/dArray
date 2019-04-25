package multithreading.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        sem.release(); // Increases the permit by one
        sem.acquire(); //Decrease the permit by one and waits indefinitely if permit is not available
        System.out.println("Available permits: "+ sem.availablePermits());

        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0; i<200; i++){
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

    }
}
