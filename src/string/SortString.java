package string;

import java.util.ArrayList;
import java.util.Arrays;

public class SortString {

    // Driver method
    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }

    private static String sortString(String inputString) {
        Character tempArray[] = new Character[inputString.length()];
        for(int i=0; i<inputString.length(); i++){
            tempArray[i] = inputString.charAt(i);
        }
        Arrays.sort(tempArray);
        StringBuilder stringBuilder = new StringBuilder(tempArray.length);
        for(Character c: tempArray){
            stringBuilder.append(c.charValue());
        }
        return new String(stringBuilder);
    }

//    private static String sortString(String inputString) {
//        char[] chars = inputString.toCharArray();
//
//        Arrays.sort(chars);
//
//        String s = new String(chars);
//        return s;
//    }
}
