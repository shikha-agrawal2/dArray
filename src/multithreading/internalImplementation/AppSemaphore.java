package multithreading.internalImplementation;

public class AppSemaphore {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore();
        SendingThread sender = new SendingThread(semaphore);
        ReceivingThread receiver = new ReceivingThread(semaphore);
        sender.start();
        receiver.start();
    }

    private static class SendingThread extends Thread {
        Semaphore semaphore = null;

        public SendingThread(Semaphore semaphore) {
            this.semaphore = semaphore;
        }
        public void run(){
            while (true){
                this.semaphore.acquire();
            }
        }

    }

    private static class ReceivingThread extends Thread{
        Semaphore semaphore = null;
        public ReceivingThread(Semaphore semaphore) {
            this.semaphore = semaphore;
        }
        public void run() {
            while (true){
                try {
                    this.semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
