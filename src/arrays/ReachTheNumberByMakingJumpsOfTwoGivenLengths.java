package arrays;
//https://www.geeksforgeeks.org/reach-the-numbers-by-making-jumps-of-two-given-lengths/

/*Approach: Any number x that is reachable from k with jumps d1 or d2 will be of the form x = k + (i * d1) + (j * d2) where i and j are integers.
        Let the GCD of d1 and d2 be gcd. Since, gcd divides both d1 and d2. Therefore we can write d1 = m1 * gcd and d2 = m2 * gcd where m1 and m2 are integers
        And x = k + gcd * (i * m1 + j * m2) = k + M * gcd.
        So, any number x that is reachable from k should satisfy (x – k) % gcd = 0.*/
public class ReachTheNumberByMakingJumpsOfTwoGivenLengths {
    public static void main(String[] args) {
        // Numbers to be checked for reachability
        int nums[] = {9, 4};
        int n = nums.length;
        // Starting number K
        int k = 8;

        // Sizes of jumps d1 and d2
        int d1 = 3, d2 = 2;

        reachTheNums(nums, k, d1, d2, n);
    }

    // Recursive function to return gcd of a and b
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static void reachTheNums(int[] nums, int k, int d1, int d2, int n) {
        int i;
        int ans[] = new int[n];
        int gcd = gcd(d1, d2);

        for (i = 0; i < n; i++) {
            int x = nums[i] - k;

            // If distance x is coverable
            if (x % gcd == 0)
                ans[i] = 1;
            else
                ans[i] = 0;
        }

        for (i = 0; i < n; i++)
            System.out.print(ans[i] + " ");
    }
}
