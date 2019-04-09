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
class Result {

    /*
     * Complete the 'requiredAmountAtStart' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY netSaving as parameter.
     */

    public static int requiredAmountAtStart(List<Integer> netSaving) {
        int output=0;
        int current=0;
        for(int i : netSaving){
            current+=i;
            if(current<0){
                current+=-current;
            }
        }
        return  current>=0? 0: -(current+1);
    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int netSavingCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> netSaving = IntStream.range(0, netSavingCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.requiredAmountAtStart(netSaving);
        System.out.println("o/p"+result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

