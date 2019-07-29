package multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//CountDownLatch is used to make sure that a task waits for other threads before it starts.
//Working of CountDownLatch:
//When we create an object of CountDownLatch,
// we specify the number of threads it should wait for, all such thread are required to do count down by calling
// CountDownLatch.countDown() once they are completed or ready to the job.
// As soon as count reaches zero, the waiting task starts running.


//countDown() method decrements the count and await() method blocks until count == 0
public class ProcessorCDL implements Runnable {
    private CountDownLatch latch;

    public ProcessorCDL(CountDownLatch latch) {
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

class App {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);  // CountDownLatch is thread safe
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++) {
            executor.submit(new ProcessorCDL(latch));
        }
        try {
            latch.await(); // The main task waits for 3 threads
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed.");
    }
}
