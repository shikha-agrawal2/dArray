package coreJava;

public class PassByValueTest {

    static void print(PassByValuePojo object) {
        object.setA(10);

    }
    static private void foo(Object bar) {
        bar = null;
    }

    public static void main(String[] args) {
        PassByValuePojo ob = new PassByValuePojo(5);
        print(ob);
        System.out.println(ob.getA());
       // String a = "ABC";
        StringBuilder a = new StringBuilder("ABC");
        foo(a);
        System.out.println(a);

    }



}
