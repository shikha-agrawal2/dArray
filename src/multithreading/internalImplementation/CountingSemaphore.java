package multithreading.internalImplementation;

public class CountingSemaphore {
    private int signals=0;
    public synchronized void acquire(){
        this.signals++;
        this.notify();
    }
    public synchronized void release() throws InterruptedException {
        while(this.signals==0) wait();
        this.signals--;
    }
}
