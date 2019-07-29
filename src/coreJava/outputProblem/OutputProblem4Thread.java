package coreJava.outputProblem;
//Output:
//
//Run Time Exception
//
//Explanation:
//Exception in thread “main” java.lang.IllegalThreadStateException at java.lang.Thread.start
//Thread cannot be started twice.
public class OutputProblem4Thread extends Thread{

    public void run()
    {
        System.out.print("Hello...");
    }
    public static void main(String args[])
    {
        OutputProblem4Thread T1 = new OutputProblem4Thread();
        T1.start();
        T1.stop();
        T1.start();
    }
}
