package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sum = twoSum(nums, target);
        System.out.println(sum[0] + " " + sum[1]);
        int[] nums1 = {3, 3};
        int[] result2 = twoSum(nums1, 6);
        System.out.println(result2[0] + " " + result2[1]);
    }
    //Using brute force
//    public static int[] twoSum(int[] nums, int target) {
//        // int[] a = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (j != i && nums[j] == target - nums[i]) {
//                    return new int[]{i, j};           //Returning of int[]
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        int[] a = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i])) {
//                map.put(nums[i], Arrays.asList(i));
//            }else if(map.get(nums[i]).get(0)!=i){
//            }
//
//            }
//            if (!map.isEmpty() && map.containsKey(target - nums[i])) {
//                a[0] = map.get(target - nums[i]).;
//                a[1] = map.get(nums[i]);
//            }
//        }
//        return a;
    }
}
