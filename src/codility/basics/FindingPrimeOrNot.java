package codility.basics;

public class FindingPrimeOrNot {
    public static void main(String[] args) {
        boolean is = isPrimeOrNot(11);
        System.out.println(is);
    }

    private static boolean isPrimeOrNot(int number) {
        for(int i=2; i<number; i++){
            if(number%i==0) return false;
        }
        return true;
    }
}
