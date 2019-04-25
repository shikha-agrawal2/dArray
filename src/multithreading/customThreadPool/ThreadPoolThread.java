package multithreading.customThreadPool;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPoolThread extends Thread {
    private LinkedBlockingQueue<Runnable> taskQueue;
    private ThreadPool threadPool;

    public ThreadPoolThread(LinkedBlockingQueue<Runnable> taskQueue, ThreadPool threadPool) {
        this.taskQueue = taskQueue;
        this.threadPool = threadPool;
    }

    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()
                    +" is READY to execute task.");
            Runnable runnable = taskQueue.take();
            System.out.println(Thread.currentThread().getName()
                    +" has taken task.");
            runnable.run();
            System.out.println(Thread.currentThread().getName()
                    +" has EXECUTED task.");
//            if(this.threadPool.isPoolShutDownInitiated() && this.taskQueue.size() ==0){
//                this.interrupt();
//                Thread.sleep(100);
//            }
        } catch (Exception exception){
            System.out.println(Thread.currentThread().getName()+" has been STOPPED.");
        }
    }
}
