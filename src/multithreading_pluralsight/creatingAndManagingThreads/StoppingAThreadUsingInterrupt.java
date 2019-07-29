package multithreading_pluralsight.creatingAndManagingThreads;

import java.util.concurrent.TimeUnit;

/*Using Thread.interrupt() method: Whenever an interrupt has been sent to a thread, it should stop whatever task it
is performing. It is very likely that whenever the thread receives an interrupt, it is to be terminated.
This action can be done by using the interrupt() method. Whenever Thread.interrput() is called,
it sets a flag known as the interrupt status to true. This means that the thread has to stop performing further execution.
 The default value of this flag is false.*/
//interrupted()- checks for and clears the interrupt and isInterrupted()- checks for but doesn't the clear the interrupt
public class StoppingAThreadUsingInterrupt {
    public static void main(String[] args) {
        Bartender bartender = new Bartender();
        Thread bartenderThread = new Thread(bartender, "Bartender");
        bartenderThread.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

        }
        int numCustomers = 5;
        for(int i=1; i< numCustomers; i++){
            String customerName = "Customer "+ i;
            Customer customer = new Customer(bartenderThread, customerName, (int)(Math.random() *10));
            new Thread(customer, customerName).start();
        }

    }
}
