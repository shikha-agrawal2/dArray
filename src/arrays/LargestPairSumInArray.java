package arrays;
//https://www.geeksforgeeks.org/find-the-largest-pair-sum-in-an-unsorted-array/
//Find the largest pair sum in an unsorted array
//Given an unsorted of distinct integers,
// find the largest pair sum in it. For example, the largest pair sum in {12, 34, 10, 6, 40} is 74.
public class LargestPairSumInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{12, 34, 10, 6, 40};
        System.out.println(findLargestPairSum(arr));
    }

    private static int findLargestPairSum(int[] arr) {
        int first = Math.max(arr[0], arr[1]);
        int second = Math.min(arr[0], arr[1]);

        for(int i=2; i<arr.length;i++){
            if(first<arr[i]){
                second=first;
                first=arr[i];
            }else{
                if(second<arr[i] && arr[i]!=first){
                    second=arr[i];
                }
            }
        }
        return first+second;


    }
}
