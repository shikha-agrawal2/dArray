package coreJava;

public class MutableClass {
    private int a=1;
    public MutableClass(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

 class ChildMutableClass extends MutableClass{

     public ChildMutableClass(int a) {
         super(a);
     }

     public static void main(String[] args) {
        MutableClass mutableClass = new ChildMutableClass(10);
         System.out.println(mutableClass.getA());
     }
 }



