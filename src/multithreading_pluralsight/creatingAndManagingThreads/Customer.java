package multithreading_pluralsight.creatingAndManagingThreads;

import java.util.concurrent.TimeUnit;

public class Customer implements Runnable {
    private Thread bartenderThread;
    private String customerName;
    private int waitTime;

    public Customer(Thread bartenderThread, String customerName, int waitTime) {

        this.bartenderThread = bartenderThread;
        this.customerName = customerName;
        this.waitTime = waitTime;
    }

    @Override
    public void run() {
        System.out.println("Doesn't seem to anyone around. I'll wait for a moment");
        try {
            TimeUnit.SECONDS.sleep(waitTime);
        }
        catch (InterruptedException ex){

        }
        System.out.println(customerName + "Oh there is a bell!! Can I get some service around here?");
        bartenderThread.interrupt();
    }
}
