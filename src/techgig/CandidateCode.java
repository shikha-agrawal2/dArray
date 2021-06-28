package techgig;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class CandidateCode {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine().trim());
        List<Character> resultList = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            String input = bufferedReader.readLine().trim();
            if (!input.isEmpty() && Pattern.compile("^[a-z]").matcher(input).find())
                resultList.add(printOutput(input));
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }

    }

    private static Character printOutput(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] inputArray = input.toCharArray();
        for (char c : inputArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int max = Collections.max(map.values());
        List<Character> outputList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                outputList.add(entry.getKey());
            }
        }
        if (outputList.size() == 1) {
            return outputList.get(0);
        } else {
            Collections.sort(outputList);
            return outputList.get(0);
        }
    }
}
