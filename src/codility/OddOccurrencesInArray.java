package codility;

import java.util.HashMap;
import java.util.Map;
//https://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] test = {9, 3, 9, 3, 9, 7, 9};
        int solution = solution(test);
        System.out.println(solution);
        int[] test1 = {9, 3, 9, 3, 9, 7, 7};
        int solution1 = solution(test1);
        System.out.println(solution1);
        //Using Method2
        int[] test2 = {9, 3, 9, 3, 9, 7, 9};
        int solution11 = solution1(test2);
        System.out.println(solution11);
        int[] test3 = {9, 3, 9, 3, 9, 7, 7};
        int solution12 = solution1(test3);
        System.out.println(solution12);
    }
//Method 1 - Using hashing
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

    //Method 2- Using XOR (The Best CountIndexPairsWithEqualElementsArray is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring element.
    // Please note that XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x.)
    public static int solution1(int[] A){
        int result=0;
        for(int i=0; i< A.length;i++){
            result = result ^ A[i];
        }
        return result;
    }
}
