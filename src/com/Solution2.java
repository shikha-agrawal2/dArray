//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//    /*
//     * Complete the 'minMoves' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY avg as parameter.
//     */
//
//    public static int minMoves(List<Integer> avg) {
//        int noOfOnes = 0;
//        int n= avg.size();
//        // find total number of all in the array
//        for (int i = 0; i < n; i++) {
//            if (avg.get(i) == 1)
//                noOfOnes++;
//        }
//
//        // length of subarray to check for
//        int x = noOfOnes;
//
//        int maxOnes = Integer.MIN_VALUE;
//
//        // array to store number of 1's upto
//        // ith index
//        int preCompute[] = new int[n];
//
//        // calculate number of 1's upto ith
//        // index and store in the array preCompute[]
//        if (avg.get(0) == 1)
//            preCompute[0] = 1;
//        for (int i = 1; i < n; i++) {
//            if (avg.get(i) == 1) {
//                preCompute[i] = preCompute[i - 1] + 1;
//            } else
//                preCompute[i] = preCompute[i - 1];
//        }
//
//        // using sliding window technique to find
//        // max number of ones in subarray of length x
//        for (int i = x - 1; i < n; i++) {
//            if (i == (x - 1))
//                noOfOnes = preCompute[i];
//            else
//                noOfOnes = preCompute[i] - preCompute[i - x];
//
//            if (maxOnes < noOfOnes)
//                maxOnes = noOfOnes;
//        }
//
//        // calculate number of zeros in subarray
//        // of length x with maximum number of 1's
//        int noOfZeroes = x - maxOnes;
//
//        return noOfZeroes;
//
//    }
//
//}
//
//public class Solution2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int avgCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> avg = IntStream.range(0, avgCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = Result.minMoves(avg);
//        System.out.println(result);
//       // bufferedWriter.write(String.valueOf(result));
//        //bufferedWriter.newLine();
//
//        bufferedReader.close();
//        //bufferedWriter.close();
//    }
//}
