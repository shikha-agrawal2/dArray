package codility;

import java.util.HashMap;
import java.util.Map;

/*This is a demo task.

Write a function:

int solution(int A[], int N);

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000]; each element of array A is an integer within the range [−1,000,000..1,000,000]. Complexity:
*/
public class MissingInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8
//        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                map.put(A[i], A[i]);
        }
        if (map.isEmpty())
            return 1;

        for (int i = 0; i < map.keySet().size(); i++) {
            if (!(map.containsKey(i + 1))) {

                return i + 1;
            }
        }

        return map.size() + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int solution = solution(arr);
        System.out.println(solution);
        int[] arr1 = {-1, -2, 3};
        int solution1 = solution(arr1);
        System.out.println(solution1);
    }
}
