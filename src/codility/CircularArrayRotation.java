package codility;

public class CircularArrayRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int[] solution = solution(arr, 4);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
        int arr1[] = {3, 8, 9, 7, 6};
        int[] solution1 = solution(arr1, 3);
        for (int i = 0; i < solution1.length; i++) {
            System.out.println(solution1[i]);
        }

    }

    public static int[] solution(int[] A, int K) {
        int[] arr = new int[A.length];
        int a = 0;
        // write your code in Java SE 8

        for (int j = 0; j < A.length; j++) {
//            if (j + K < A.length)
//                arr[j + K] = A[j];
//            else
            a = (j + K) % (A.length);
            arr[a] = A[j];
        }

        return arr;

    }

}
