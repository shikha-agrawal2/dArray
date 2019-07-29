package arrays;

//https://www.geeksforgeeks.org/find-subarray-with-given-sum/
public class FindSubarraysWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, sum);
    }

    private static int subArraySum(int[] arr, int sum) {
        // Pick a starting point
        int n = arr.length;
        int curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i
                            + " and " + p);
                    return 1;
                }
                if (curr_sum > sum) break;
                curr_sum = curr_sum + arr[j];
            }
        }
        return 0;
    }
}
