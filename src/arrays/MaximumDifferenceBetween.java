package arrays;
//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;




public class MaximumDifferenceBetween {
    public static int maxDifference(List<Integer> arr) {
        // Write your code here
//        int size = arr.size();
//        int max_diff = arr.get(1) - arr.get(0);
//        int i, j;
//        for (i = 0; i < size; i++)
//        {
//            for (j = i + 1; j < size; j++)
//            {
//                if (arr.get(j) - arr.get(i) > max_diff)
//                    max_diff = arr.get(j) - arr.get(i);
//            }
//        }
//        if(max_diff<0) return -1;
//        return max_diff;

        int maxDifference = -1;
        int size= arr.size();

        int maxRightValue = arr.get(size-1);

        for (int i = size-2; i >= 0; i--)
        {
            if (arr.get(i) > maxRightValue)
                maxRightValue = arr.get(i);
            else
            {
                int diff = maxRightValue - arr.get(i);
                if (diff > maxDifference)
                {
                    maxDifference = diff;
                }
            }
        }
        return maxDifference;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = MaximumDifferenceBetween.maxDifference(arr);
        System.out.println(result);

       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}