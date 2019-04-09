package recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial"+ getFactorial(3));
    }

    private static int getFactorial(int number) {
        System.out.println("Method" + number);
//base condition
        if(number ==1){
            return 1;
        }
        else{
            int result = number * getFactorial(number-1);
            return result;
        }
    }
}
