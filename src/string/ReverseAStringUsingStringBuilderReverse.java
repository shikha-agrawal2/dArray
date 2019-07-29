package string;

//https://www.geeksforgeeks.org/stringbuilder-reverse-in-java-with-examples/
//StringBuilder reverse() in Java with Examples
//The reverse() method of StringBuilder is used to reverse the characters in the StringBuilder. The method helps to this character sequence to be replaced by the reverse of the sequence.
//
//Syntax:
//
//public java.lang.AbstractStringBuilder reverse()
public class ReverseAStringUsingStringBuilderReverse {
    public static void main(String[] args) {
        StringBuilder str
                = new StringBuilder("WelcomeGeeks");

        // print string
        System.out.println("String = "
                + str.toString());

        // reverse the string
        StringBuilder reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr.toString());
    }
}
