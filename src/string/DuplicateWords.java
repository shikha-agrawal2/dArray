package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://www.javatpoint.com/program-to-find-the-duplicate-words-in-a-string
//Find Duplicate words in String
public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }

        for(Map.Entry<String, Integer> entry :map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" repeated "+ entry.getValue()+" times");
            }
        }


    }
}
