package coreJava.outputProblem;

public class OutputProblem6StaticBlock {
    static int num;
    static String mystr;

    // constructor 
    OutputProblem6StaticBlock()
    {
        num = 100;
        mystr = "Constructor";
    }

    // First Static block 
    static
    {
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }

    // Second static block 
    static
    {
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }

    public static void main(String args[])
    {
        OutputProblem6StaticBlock a = new OutputProblem6StaticBlock();
        System.out.println("Value of num = " + a.num);
        System.out.println("Value of mystr = " + a.mystr);
    }
}

//Output:
//
//Static Block 1
//Static Block 2
//Value of num = 100
//Value of mystr = Constructor
//Explanation:
//Static block gets executed when the class is loaded in the memory. A class can have multiple Static blocks, which are executed in the same sequence in which they have been written into the program.
//Note: Static Methods can access class variables without using object of the class. Since constructor is called when a new instance is created so firstly the static blocks are called and after that the constructor is called.
// If we would have run the same program without using object, the constructor would not have been called.