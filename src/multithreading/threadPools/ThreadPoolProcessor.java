package multithreading.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolProcessor implements Runnable{
    private int id;

    public ThreadPoolProcessor(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting: "+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: "+ id);
    }
}

class App{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); // 2 workers in a factory
        for(int i=0; i<5; i++){
            executor.submit(new ThreadPoolProcessor(i)); // submitting task
        }
        executor.shutdown();
        System.out.println("All tasks submitted.");
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks completed");
    }

}
