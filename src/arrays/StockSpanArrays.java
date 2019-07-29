package arrays;

import java.util.Arrays;
//https://www.geeksforgeeks.org/the-stock-span-problem/
public class StockSpanArrays {
    // Driver program to test above functions
    public static void main(String[] args) {
        int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);

        // System.out.println(3+2/5+2);
    }

    private static void printArray(int[] s) {
        System.out.print(Arrays.toString(s));
    }

    private static void calculateSpan(int[] price, int n, int[] s) {
        s[0] = 1;
        for (int i = 1; i < n; i++) {
            s[i] = 1;
            for (int j = i - 1; j >= 0 && price[i] >= price[j]; j--) {
                s[i]++;
            }
        }
    }
}
