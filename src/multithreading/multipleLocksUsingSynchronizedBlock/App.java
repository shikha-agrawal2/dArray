package multithreading.multipleLocksUsingSynchronizedBlock;
/*o/p :
Starting...
Time taken 2392
List1: 1999; List2: 2000 list size is always different as synchronized is not used
Starting...
Time taken 4088
List1: 2000; List2: 2000   -list size is always 2000
Starting...
Time taken 2061  -- time has reduced from above synchronized method
List1: 2000; List2: 2000*/
public class App {
    public static void main(String[] args) {
        new Worker().main();
        new WorkerSynchronized().main();
        new WorkerSynchronized2().main();  // It takes approx 2s as there are 2 locks and other thread has not to wait for 1st thread to finish
    }
}
