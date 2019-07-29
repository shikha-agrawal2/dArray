package multithreading.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
//Semaphore in Java
//A semaphore controls access to a shared resource through the use of a counter. If the counter is greater than zero, then access is allowed. If it is zero, then access is denied. What the counter is counting are permits that allow access to the shared resource.
// Thus, to access the resource, a thread must be granted a permit from the semaphore.
public class App {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(1);
        sem.release(); // Increases the permit by one
        sem.acquire(); //Decrease the permit by one and waits indefinitely if permit is not available
        System.out.println("Available permits: "+ sem.availablePermits());

        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0; i<20; i++){
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
