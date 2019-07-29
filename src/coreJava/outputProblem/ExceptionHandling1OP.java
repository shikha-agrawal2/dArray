package coreJava.outputProblem;

public class ExceptionHandling1OP {
    public static void main(String[] args)
    {
        try
        {
            return;
        }
        finally
        {
            System.out.println( "Finally" );
        }
    }
}

//1
//If you put a finally block after a try and its associated catch blocks, then once execution enters the try block, the code in that finally block will definitely be executed except in the following circumstances:
//An exception arising in the finally block itself.
//The death of the thread.
//The use of System.exit()
//Turning off the power to the CPU.


//2
//If ArithmeticException appears before Exception, then the file will compile. When catching exceptions the more specific exceptions must be listed before the more general (the subclasses must be caught before the superclasses).


