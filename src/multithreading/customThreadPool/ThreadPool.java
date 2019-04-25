package multithreading.customThreadPool;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    private LinkedBlockingQueue<Runnable> taskQueue;
    private boolean doesShutDownInitiated = false;

    public ThreadPool(int numberOfThreads) {
        this.taskQueue = new LinkedBlockingQueue<>(numberOfThreads);

        for (int i = 1; i <= numberOfThreads; i++) {
            ThreadPoolThread threadPoolThread = new ThreadPoolThread(taskQueue, this);
            threadPoolThread.setName("Thread - " + i);
            System.out.println("Thread-" + i + " created in ThreadPool.");
            threadPoolThread.start();
        }
    }

    public synchronized void execute(Runnable task) throws Exception {
        if (doesShutDownInitiated) {
            throw new Exception("pool has been shutdown");
        }
        System.out.println("task has been added.");
        this.taskQueue.put(task);
    }

    public boolean isPoolShutDownInitiated() {
        return doesShutDownInitiated;
    }


    /**
     * Initiates shutdown of ThreadPool, previously submitted tasks
     * are executed, but no new tasks will be accepted.
     */
    public synchronized void shutdown() {
        this.doesShutDownInitiated = true;
        System.out.println("ThreadPool SHUTDOWN initiated.");
    }


}
