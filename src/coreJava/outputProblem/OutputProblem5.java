package coreJava.outputProblem;

public class OutputProblem5 {
    // constructor
    OutputProblem5()
    {
        System.out.println("Geeksforgeeks");
    }

    OutputProblem5 a = new OutputProblem5(); //line 8

    public static void main(String args[])
    {
        OutputProblem5 b; //line 12
        b = new OutputProblem5();
    }
}
