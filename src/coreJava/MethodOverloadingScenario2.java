package coreJava;

public class MethodOverloadingScenario2 {
    public static void gfg(String s)
    {
        System.out.println("String");
    }
    public static void gfg(Object o)
    {
        System.out.println("Object");
    }
    public static void gfg(Integer i)
    {
        System.out.println("Integer");
    }

    public static void main(String args[])
    {
        //gfg(null);
    }
}

//Output:
//
//Compile Error
//Explanation- In this case of method Overloading, the most specific method is choosen at compile time.
//As ‘java.lang.String’ and ‘java.lang.Integer’ is a more specific type than ‘java.lang.Object’,but between ‘java.lang.String’ and ‘java.lang.Integer’ none is more specific.
//In this case the Java is unable to decide which method to call.
