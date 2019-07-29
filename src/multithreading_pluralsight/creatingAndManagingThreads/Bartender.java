package multithreading_pluralsight.creatingAndManagingThreads;

import java.util.concurrent.TimeUnit;

public class Bartender implements Runnable {
    @Override
    public void run() {
        System.out.println("Bartender: My boss isn't in today; time for quick snooze!");
        while (true){
            if(Thread.interrupted()){
                System.out.println("Bartender: Zzz or erm, is someone waiting?");
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
