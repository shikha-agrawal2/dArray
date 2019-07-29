package arrays;
//https://www.geeksforgeeks.org/count-pairs-with-given-sum/
//After completion of second traversal, we’d have twice the required
// value stored in counter because every pair is counted two times. Hence divide count by 2 and return.
import java.util.HashMap;

public class CountPairsWithGivenSum {

    static int arr[] = new int[]{1, 5, 7, -1, 5};

    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 1);
            else
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }

    // Driver method to test the above function
    public static void main(String[] args) {

        int sum = 6;
        System.out.println("Count of pairs is " +
                getPairsCount(arr.length, sum));

    }
}