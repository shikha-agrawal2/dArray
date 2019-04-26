package arrays;
//https://www.geeksforgeeks.org/segregate-even-and-odd-numbers/
public class SeggregateEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] arr ={12, 34, 45, 9, 8, 90, 3};
        segregateEvenAndOdd(arr);
        System.out.println("Array after segregation");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    private static void segregateEvenAndOdd(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while (left<right){
            while(arr[left]%2==0 && left<right){
                left++;
            }
            while (arr[right]%2!=0 && left<right){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

    }
}
