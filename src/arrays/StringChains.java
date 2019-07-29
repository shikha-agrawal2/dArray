package arrays;

import java.util.ArrayList;
import java.util.List;

public class StringChains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("ba");
        list.add("bca");
        list.add("bda");
        list.add("bdca");
        int i = countMaxLength(list);
        System.out.println(i);
        List<String> list1 = new ArrayList<>();
        list1.add("");
        list1.add("");
        list1.add("");
        list1.add("");
        list1.add("");
        list1.add("");
    }

    private static int countMaxLength(List<String> list) {
        int maxLength = 0;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int count = str.length();
            for (int j = 0; j < str.length(); j++) {
                String s = str.substring(0, j) + str.substring(j + 1, str.length());
                if (list.contains(s)) {
                    maxLength=Math.max(count, maxLength);
                }
                System.out.println(s);
            }
        }
        return maxLength;
    }
}
