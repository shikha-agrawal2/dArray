package string;

import java.io.*;
import java.util.*;
public class NoCharAddedToMakeStringPalindrome {
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        int output=getMinNoOfCharacters(word.toCharArray(), 0, n-1);
        System.out.println(output);
    }

    private static int getMinNoOfCharacters(char[] str, int l, int h) {
        if (l > h) return Integer.MAX_VALUE;
        if (l == h) return 0;
        if (l == h - 1) return (str[l] == str[h])? 0 : 1;

        return (str[l] == str[h])?
                getMinNoOfCharacters(str, l + 1, h - 1):
                (Integer.min(getMinNoOfCharacters(str, l, h - 1),
                        getMinNoOfCharacters(str, l + 1, h)) + 1);
    }
}