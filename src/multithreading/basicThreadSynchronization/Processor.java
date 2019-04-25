package multithreading.basicThreadSynchronization;

import java.util.Scanner;

public class Processor extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}

class App {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.start();

        System.out.println("Press return key to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        processor.shutdown();
    }
}
