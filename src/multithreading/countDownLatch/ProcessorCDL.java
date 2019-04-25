package multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcessorCDL implements Runnable {
    private CountDownLatch latch;
    public ProcessorCDL(CountDownLatch latch){
        this.latch = latch;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Started.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
    }

}

class App{
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);  // CountDownLatch is thread safe
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i=0; i<4; i++){
            executor.submit(new ProcessorCDL(latch));
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed.");
    }
}
