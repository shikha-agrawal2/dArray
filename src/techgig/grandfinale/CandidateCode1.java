package techgig.grandfinale;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class CandidateCode1 {
    public static void main(String[] args) throws Exception {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int N = scan.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scan.nextInt();
            }
            int sum = 0;
            int result = countGeekGoddess(arr, sum);
            System.out.println(result);

        }

    }

    private static int countGeekGoddess(int[] arr, int sum) {
        int n = arr.length;
        Stack<Integer> s = new Stack();
        int i = 0;
        int element, next;

        s.push(arr[0]);

        for (i = 1; i < n; i++) {
            next = arr[i];

            if (s.isEmpty() == false) {

                element = s.pop();

                while (element < next) {
                    if (s.isEmpty() == true)
                        break;
                    element = s.pop();
                }

                if (element > next)
                    s.push(element);
            }

            s.push(next);
        }

        while (s.isEmpty() == false) {
            element = s.pop();
            next = -1;
            sum += 1;
        }
        return sum;

    }
}
