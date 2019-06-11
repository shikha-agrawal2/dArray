package coreJava;
//We can not declare the static variable inside the block. If we declare
// static variable inside the block, then we will get the compile time error : illegal start of expression.
public class DeclaringStaticVariableInsideBlockNotAllowed {
    static  int i=1;
    public static void main(String[] args) {
        //static int i=1;   //Compile Error
        int i=1;
        for(DeclaringStaticVariableInsideBlockNotAllowed.i=1; DeclaringStaticVariableInsideBlockNotAllowed.i<10; DeclaringStaticVariableInsideBlockNotAllowed.i++){
            i=i+2;
            System.out.println(i+" ");
        }
    }
}
