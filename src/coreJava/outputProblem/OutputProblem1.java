package coreJava.outputProblem;
//https://www.geeksforgeeks.org/output-of-java-program-set-5-2/
public class OutputProblem1 {
    public static void main(String args[])
    {
        short s = 0;
        int x = 07;
       // int y = 08;// Any number beginning with zero is treated as an octal number (which is 0-7).
        int y=8;
        int z = 112345;

        s += z;//the += does an automatic cast to a short.
        // However the number 123456 can’t be contained within a short, so you end up with a negative value (-7616).
        System.out.println("" + x + y + s);
    }
}
