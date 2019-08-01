package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        printDuplicateCharacters("Programming");
    }

    private static void printDuplicateCharacters(String word) {
        char[] chars = word.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<Character, Integer>();
        for(Character ch: chars){
            if(characterIntegerHashMap.containsKey(ch)){
                characterIntegerHashMap.put(ch, characterIntegerHashMap.get(ch)+ 1);
            }
            else{
                characterIntegerHashMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = characterIntegerHashMap.entrySet();
        for(Map.Entry<Character, Integer> entry: entries){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
