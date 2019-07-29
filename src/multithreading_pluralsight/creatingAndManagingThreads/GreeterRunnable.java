package multithreading_pluralsight.creatingAndManagingThreads;

public class GreeterRunnable implements Runnable{
    private String country;
    public GreeterRunnable(String country){
        // super(country + " thread");
        this.country = country;
    }
    @Override
    public void run() {

    }
}
