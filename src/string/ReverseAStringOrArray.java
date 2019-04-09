package string;

public class ReverseAStringOrArray {
    /* Function to reverse arr[] from
        start to end*/
    /*1) Initialize start and end indexes as start = 0, end = n-1
            2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
    start = start +1, end = end – 1*/
    static void rvereseArray(int arr[],
                             int start, int end)
    {
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 /* Recursive way */
    /* Function to reverse arr[] from start to end*/
//    static void rvereseArray(int arr[], int start, int end)
//    {
//        int temp;
//        if (start >= end)
//            return;
//        temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        rvereseArray(arr, start+1, end-1);
//    }
    /* Utility that prints out an
    array on a line */
    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);

    }
}