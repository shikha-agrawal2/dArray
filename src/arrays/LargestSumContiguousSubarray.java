package arrays;
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class LargestSumContiguousSubarray {
    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    private static int maxSubArraySum(int[] a) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        int start=0, end=0, s=0;
        for(int i=0; i< a.length; i++){
            max_ending_here = max_ending_here + a[i];
            if(max_ending_here<0){
                max_ending_here = 0;
                s=i+1;
            }
            else if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
        }
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return max_so_far;
    }
}
