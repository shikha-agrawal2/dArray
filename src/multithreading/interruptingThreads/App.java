package multithreading.interruptingThreads;

import java.util.Random;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting.");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random ran = new Random();
                for(int i=0; i< 1E8; i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Interrupted!");
                        break;
                    }
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        System.out.println("We've been interrupted");
//                        break;
//                    }
                    Math.sin(ran.nextDouble());
                }
            }
        });
        thread.start();

        Thread.sleep(500);

        thread.interrupt();//sets interrupt flag as true and it can be checked by isInterrputed()
        //thread.stop();  //stop()is depracated
        thread.join();
        System.out.println("Finished");
    }
}
