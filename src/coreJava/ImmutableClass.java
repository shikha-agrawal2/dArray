package coreJava;
/*To create an immutable class in java, you have to do following steps.

Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final int a;
    private List<Integer> list;

    public ImmutableClass(int a) {
        this.a = a;
        this.list = new ArrayList<Integer>();
        this.list.add(10);
    }

    public int getA() {
        return a;
    }

    public List<Integer> getList() {
        return (List<Integer>) ((ArrayList)list).clone();
    }

    public static void main(String[] args) {
        ImmutableClass i =  new ImmutableClass(10);
        int e = i.getA();
        System.out.println(e);

        List<Integer> list = i.getList();
        //list.add(1);    //becomes mutable so we should use clone method in get() for list
       // List<Integer> list1 = i.getList();
        //System.out.println(list1);

        list.add(1);
        List<Integer> list1 = i.getList();
        System.out.println(list1);
    }
}
