package multithreading.interruptingThreads;

import java.util.Random;
import java.util.concurrent.*;

public class App1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting..");
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<?> future = exec.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Random ran = new Random();
                for (int i = 0; i < 1E8; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted!");
                        break;
                    }
                    Math.sin(ran.nextDouble());
                }
                return null;
            }
        });
        exec.shutdown();

        Thread.sleep(500);
        exec.shutdownNow();//Interrupting Threads
       // future.cancel(true); //Interrupting Threads
        exec.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("Finished");
    }
}
