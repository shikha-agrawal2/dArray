package hackerrank;

import java.util.Scanner;

public class HCFOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int g = getGCDOfArrayOfNNumber(arr, n);
        System.out.println(g);
    }

    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named CountIndexPairsWithEqualElementsArray. */
    static int getGCDOfArrayOfNNumber(int arr[], int n){
        int result = arr[0];
        for(int i=1; i<n;i++){
            result = getGCDOfTwoNumber(result, arr[i]);
        }
        return result;
    }
    static int getGCDOfTwoNumber(int x, int y){
        if(x==y) return x;
        return getGCDOfTwoNumber(x>y ? x-y : y-x, x>y ? y : x );
    }
}
