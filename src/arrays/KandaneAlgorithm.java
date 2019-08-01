package arrays;

import java.util.Scanner;

public class KandaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testCases=sc.nextInt();
        for(int i=0; i<testCases; i++){
            int size = sc.nextInt();
            int a[] = new int[size];
            for(int j=0; j<size; j++){
                a[j]=sc.nextInt();
            }
            int sum=maxSubArraySum(a);
            System.out.println("Sum ="+sum);
        }
    }

    private static int maxSubArraySum(int[] a) {
        //Integer.MIN_VALUE should be used for sum
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        int size=a.length;
        for(int i=0; i<size; i++){
        max_ending_here= max_ending_here+a[i];
        if(max_so_far<max_ending_here)
            max_so_far=max_ending_here;
        if(max_ending_here<0)
            max_ending_here=0;
        }
        return max_so_far;
    }
}
