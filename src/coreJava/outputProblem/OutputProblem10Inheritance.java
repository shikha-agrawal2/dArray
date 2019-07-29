package coreJava.outputProblem;

import java.io.IOException;

//Ans: Derived
//Explanation: If the superclass method declares an exception, subclass overridden
// method can declare same, subclass exception or no exception but cannot declare parent exception.
public class OutputProblem10Inheritance {
    public void display() throws IOException {
        System.out.println("Test");
    }
}

class Derived1 extends OutputProblem10Inheritance {
    public void display() throws IOException {
        System.out.println("Derived1");
    }

    public static void main(String[] args) throws IOException {
        Derived1 object = new Derived1();
        object.display();
    }
} 

