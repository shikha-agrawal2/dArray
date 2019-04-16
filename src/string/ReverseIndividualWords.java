package string;

import java.util.Stack;

//https://www.geeksforgeeks.org/reverse-individual-words/
public class ReverseIndividualWords {
    public static void main(String[] args) {
        String s = "Hello World Ty";
        String s1 = reverseIndividualWords(s);  //Method 1 Simple approach
        System.out.println(s1);
        String s1usingStack = reverseWordsUsingStack(s); //Method2 : Using stack
        System.out.println(s1usingStack);
    }

    private static String reverseWordsUsingStack(String s) {
        Stack<Character> stack = new Stack<>();
        String reversedWord = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                stack.push(s.charAt(i));
            } else {
                while (!stack.empty()) {
                    reversedWord = reversedWord + stack.pop();
                }
                reversedWord = reversedWord + " ";
            }
        }
        while (!stack.empty()) {
            reversedWord = reversedWord + stack.pop();
        }
        return reversedWord;
    }

    private static String reverseIndividualWords(String s) {
        String[] words = s.split(" ");
        String reversedString = "";
        for (String word : words) {
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }
        return reversedString.trim();
    }
}
