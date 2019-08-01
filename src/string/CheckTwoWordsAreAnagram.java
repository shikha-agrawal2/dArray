package string;

public class CheckTwoWordsAreAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("spot", "pots"));
        System.out.println(isAnagram("army", "mary"));
    }

    private static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (Character ch : chars) {
            int index = anagram.indexOf(ch);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length()); //remove the element from anagram
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }
}
