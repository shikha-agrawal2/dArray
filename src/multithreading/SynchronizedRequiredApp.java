package multithreading;

/* count can be 20000 or less as both threads are accessing same variable count and
count++ is same as count = count+1 i.e. getting count and incrementing it*/
public class SynchronizedRequiredApp {
    private int count = 0;
    public static void main(String[] args) {
        SynchronizedRequiredApp synchronizedRequiredApp = new SynchronizedRequiredApp();
        synchronizedRequiredApp.doWork();
    }

    private void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    count++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count is" + count);
    }
}
