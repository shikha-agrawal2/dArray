package arrays;
//https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/
public class FindLargestThreeElements {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 1};
        int n = arr.length;
        print3largest(arr, n);
    }
//Time Complexity- O(n) and extra space is O(1).
    private static void print3largest(int[] arr, int n) {
        /* There should be atleast three elements */
        if (n < 3)
        {
            System.out.print(" Invalid Input ");
            return;
        }
        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]> second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println("Three largest elements are " +
                first + " " + second + " " + third);
    }
//Using sorting
//    void find3largest(int[] arr)
//    {
//        Arrays.sort(arr); //It uses Tuned Quicksort with
//        //avg. case Time complexity = O(nLogn)
//        int n = arr.length;
//        int check = 0, count = 1;
//
//        for(int i = 1; i <= n; i++){
//
//            if(count<4){
//                if(check!=arr[n-i])
//                {
//                    // to handle duplicate values
//                    System.out.print(arr[n-i]+" ");
//                    check = arr[n-i];
//                    count++;
//                }
//            }
//            else
//                break;
//        }
    }
