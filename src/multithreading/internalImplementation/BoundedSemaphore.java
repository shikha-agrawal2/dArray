package multithreading.internalImplementation;
//The CoutingSemaphore has no upper bound on how many signals it can store.
//It is possible to use a bounded semaphore as a lock. To do so, set the upper bound to 1, and have the call to take() and release() guard the critical section.
public class BoundedSemaphore {
    private int signals = 0;
    private int bound   = 0;

    public BoundedSemaphore(int upperBound){
        this.bound = upperBound;
    }

    public synchronized void take() throws InterruptedException{
        while(this.signals == bound) wait();
        this.signals++;
        this.notify();
    }

    public synchronized void release() throws InterruptedException{
        while(this.signals == 0) wait();
        this.signals--;
        this.notify();
    }
}
