package coreJava.outputProblem;
//o/p-Compilation error
//Explanation: Constructors cannot be enclosed in try/catch block.
public class OutputProblem11TryCatchConstructor {
   // try
   // {
        public OutputProblem11TryCatchConstructor()
        {
            System.out.println("GeeksforGeeks");
            try {
                throw new Exception();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
   // }
   // catch(Exception e)
   // {
   //     System.out.println("GFG");
   // }
    public static void main(String[] args)
    {
        OutputProblem11TryCatchConstructor test = new OutputProblem11TryCatchConstructor();
    }
}
