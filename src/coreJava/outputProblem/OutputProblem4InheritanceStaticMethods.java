package coreJava.outputProblem;

//Static binding (or compile time) happens for static methods. Here p.whoAmI() calls the static method so
// it is called during compile time hence results in static binding and prints the method in People class.
//Whereas p.whoAreYou() calls the method in Kid class since by default Java takes it as a virtual method
// i.e, dynamic binding.
//o/p
// Inside static method, Person(whoAmI)
//Kid(who)
//Kid(whoAreYou)
public class OutputProblem4InheritanceStaticMethods {
    public static void main(String[] args) {
        Person p = new Kid();
        p.whoAmI();
        p.whoAreYou();
    }
}

class Person {
    private void who() {
        System.out.println("Inside private method Person(who)");
    }

    public static void whoAmI() {
        System.out.println("Inside static method, Person(whoAmI)");
    }

    public void whoAreYou() {
        who();
        System.out.println("Inside virtual method, Person(whoAreYou)");
    }
}

class Kid extends Person {
    private void who() {
        System.out.println("Kid(who)");
    }

    public static void whoAmI() {
        System.out.println("Kid(whoAmI)");
    }

    public void whoAreYou() {
        who();
        System.out.println("Kid(whoAreYou)");
    }


}