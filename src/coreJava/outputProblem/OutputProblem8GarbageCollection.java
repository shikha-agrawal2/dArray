package coreJava.outputProblem;
//finalize method called
//end main
//Explanation :
//When Garbage Collector calls finalize() method on an object,
// it ignores all the exceptions raised in the method and program will terminate normally.
public class OutputProblem8GarbageCollection {
    public static void main(String[] args) throws InterruptedException
    {
        OutputProblem8GarbageCollection t = new OutputProblem8GarbageCollection();

        // making t eligible for garbage collection
        t = null;

        // calling garbage collector
        System.gc();

        // waiting for gc to complete
        Thread.sleep(1000);

        System.out.println("end main");
    }

    @Override
    protected void finalize()
    {
        System.out.println("finalize method called");
        System.out.println(10/0);
    }
}
