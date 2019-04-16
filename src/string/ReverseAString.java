package string;

public class ReverseAString {
    public static void main(String[] args) {
        String s = new String("sdfhjukliop");
        String s1 = reverseString(s);
        System.out.println(s1);
    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char aChar = chars[start];
            chars[start] = chars[end];
            chars[end] = aChar;
            start++;
            end--;
        }
        return new String(chars);
    }
}
