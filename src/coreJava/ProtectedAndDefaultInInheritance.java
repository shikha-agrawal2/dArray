package coreJava;
//only difference between protected and default access modifier is that the sub class of different package cannot access
// default method. ... The protected specifier allows access by all subclasses
// of the class in a program, whatever package they reside in, as well as to other code in the same package.

//foo() is protected in Base and default in Derived. Default access is more restrictive. When a derived class
// overrides a base class function, more restrictive access can’t be given to the overridden function.
public class ProtectedAndDefaultInInheritance {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.foo();
    }
}
class Base {
    protected void foo() {}
}
class Derived extends Base {
    //void foo() {}        //Error over here

    public void foo(){}//with public it works
}