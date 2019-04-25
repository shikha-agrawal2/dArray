package multithreading.waitAndNotify;

import java.util.Scanner;

public class Processor {
    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producer thread running...");
            wait();
            System.out.println("Resumed");
        }

    }
    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Waiting for return key");
            scanner.nextLine();
            System.out.println("Return key pressed");
            notify();
            Thread.sleep(5000);  //After notify thread goes in sleep mode and releases the lock only after 5 sec.
        }
    }
}
