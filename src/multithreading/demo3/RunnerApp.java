package multithreading.demo3;

public class RunnerApp {
    public static void main(String[] args) {
        //passing runnable to constructor of Thread class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("Hello"+ i);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        t1.start();
    }
}
