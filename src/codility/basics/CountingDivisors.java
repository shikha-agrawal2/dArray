package codility.basics;

public class CountingDivisors {
    public static void main(String[] args) {
        int count = count(100);
        System.out.println(count);
    }

//    private static int count(int number) {
//        int count=0;
//        for(int i=1; i<=Math.sqrt(number); i++) {
//            if(number%i==0){
//                if(number/i==i)
//                    count++;
//                else count+=2;
//            }
//        }
//        return count;
//    }

    private static int count(int number) {
        int count=0;
        int i=1;
        while(i*i<number){
            if(number%i==0){
                count+=2;
            }

        }
        if(i*i==number) count++;
        return count;
    }
}
