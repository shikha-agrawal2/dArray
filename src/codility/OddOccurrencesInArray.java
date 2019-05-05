package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] test = {9, 3, 9, 3, 9, 7, 9};
        int solution = solution(test);
        System.out.println(solution);
        int[] test1 = {9, 3, 9, 3, 9, 7, 7};
        int solution1 = solution(test1);
        System.out.println(solution1);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length % 2 == 0) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()%2!=0) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
