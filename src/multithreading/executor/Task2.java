package multithreading.executor;

public class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 started ");
        for(int i=201; i< 299; i++){
            System.out.println(i +" ");
        }
        System.out.println("Task2 done");
    }
}
