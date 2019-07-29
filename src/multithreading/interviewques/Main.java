package multithreading.interviewques;

public class Main {
    public static void main(String[] args) {
        SharedPrinter sp = new SharedPrinter();
        Thread odd = new Thread(new Odd(sp, 10),"Odd");
        Thread even = new Thread(new Even(sp, 10),"Even");
        odd.start();
        even.start();
    }
}
