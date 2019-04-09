package com;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Solution {
    static int countSubSequence(List<Integer> inputSeq, int targetSum) {
        int sum = 0, result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < inputSeq.size(); i++) {
            sum += inputSeq.get(i);
            if (map.containsKey(sum - targetSum)) {
                result += map.get(sum - targetSum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputSeqCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> inputSeqTemp = new ArrayList<>();

        IntStream.range(0, inputSeqCount).forEach(i -> {
            try {
                inputSeqTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> inputSeq = inputSeqTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int targetSum = Integer.parseInt(bufferedReader.readLine().trim());

        int res = countSubSequence(inputSeq, targetSum);
        System.out.println("o/p"+res);
      //  bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
