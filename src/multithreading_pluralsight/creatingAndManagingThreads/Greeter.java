package multithreading_pluralsight.creatingAndManagingThreads;
/*Creating threads and why thread.start() should be called instead of thread.run(),
difference between thread.start() where id returned by Thread.currentThread().getId() is always different
 and thread.run() where id returned by Thread.currentThread().getId() is always same*/
public class Greeter extends Thread {
    private String country;
    public Greeter(String country){
       // super(country + " thread");
        this.country = country;
    }
    public void run(){
        //Use Thread.currentThread() to get the Thread instance for the running thread
        //Why do you think long id = getId() gives a different result
        long id = Thread.currentThread().getId();
        System.out.println(id+" : Hello "+ country+ "!");
    }

    public static void main(String[] args) {
        String countries[] = {"France", "India", "China", "USA", "Germany"};
        for(String country : countries){
            new Greeter(country).start();
            //new Greeter(country).run();
        }
    }
}

/*problems inheriting from Thread, should prefer composition over inheritance
* Can only inherit from one class in java*/