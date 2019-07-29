package dynamiceprogramming;
//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them
// is that adjacent houses have security system connected and it will automatically contact the police if two
// adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum
// amount of money you can rob tonight without alerting the police.

//https://www.programcreek.com/2014/03/leetcode-house-robber-java/
public class HouseRobbing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(rob(arr.length, arr));
        System.out.println(robUsingDP(arr));
        System.out.println(robUsingEvenOddVariable(arr));

    }

    private static int robUsingEvenOddVariable(int[] nums) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even += nums[i];
                even = even > odd ? even : odd;
            } else {
                odd += nums[i];
                odd = odd > even ? odd : even;
            }
        }
        return even > odd ? even : odd;
    }

    private static int rob(int length, int[] nums) {
        if (length == 0) return nums[0];

        int max_value = Integer.MIN_VALUE;
        max_value = Math.max(max_value, rob(length - 1, nums));
        for (int j = length - 2; j >= 0; --j) {
            max_value = Math.max(max_value, rob(j, nums) + nums[length - 1]);
        }
        return max_value;
    }

    private static int robUsingDP(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[nums.length - 1];

    }
}
