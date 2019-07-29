package arrays;

import java.util.HashMap;
//https://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
public class FindIfThereIsASubArrayWith0Sum {
    public static void main(String[] args) {
        int arr[] = {-3, 2, 3, 1, 6};
        if (subArrayExists(arr))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }

    private static boolean subArrayExists(int[] arr) {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM =
                new HashMap<Integer, Integer>();

        // Initialize sum of elements
        int sum = 0;
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)
                return true;

            // Add sum to hash map
            hM.put(sum, i);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}
