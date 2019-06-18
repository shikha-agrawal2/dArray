package dynamiceprogramming;

//https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
public class CuttingARod {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                cutRod(arr, size));
        System.out.println("Maximum Obtainable Value is " +
                cutRodUsingDP(arr, size));
    }

    //Method1
    private static int cutRod(int[] price, int n) {
        if (n == 0) return 0;
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_value = Math.max(max_value, price[i] + cutRod(price, n - i - 1));
        }
        return max_value;
    }

    //Method 2 -Using dp

    static int cutRodUsingDP(int price[], int n) {
        int[] value = new int[n + 1];
        value[0] = 0;
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i <= n; i++) {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                max_val = Math.max(max_val, price[j] + value[i - j - 1]);
            }
            value[i] = max_val;
        }
        return value[n];
    }
}