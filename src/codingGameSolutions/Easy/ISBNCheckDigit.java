package codingGameSolutions.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ISBNCheckDigit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String ISBN = in.nextLine();
            if (!isValidISBN(ISBN)) {
                list.add(ISBN);
            }
        }
        System.out.println(list.size() + " invalid:");
        System.out.println(String.join("\n", list));
    }

    private static boolean isValidISBN(String ISBN) {
        if (ISBN.length() == 10) {
            return isValidISBN10(ISBN);
        } else if (ISBN.length() == 13) {
            return isValidISBN13(ISBN);
        }
        return false;
    }

    private static boolean isValidISBN13(String isbn) {
        if (!Pattern.matches("^\\d{13}$", isbn)) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < isbn.length() - 1; i++) {
            sum += (isbn.charAt(i) - '0') * (i % 2 == 0 ? 1 : 3);
        }
        int rem = sum % 10;
        int checkDigit = rem == 0 ? 0 : 10 - rem;
        int givenCheckDigit = isbn.charAt(isbn.length() - 1) - '0';
        return checkDigit == givenCheckDigit;
    }

    private static boolean isValidISBN10(String isbn) {
        //9 digit and last digit can be numbers or X
        if (!Pattern.matches("^\\d{9}(\\d|X)$", isbn)) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < isbn.length() - 1; i++) {
            sum += (isbn.charAt(i) - '0') * (10 - i);
        }
        int rem = sum % 11;
        int checkDigit = rem == 0 ? 0 : 11 - rem;
        int givenCheckDigit = isbn.charAt(isbn.length() - 1) == 'X' ? 10 : isbn.charAt(isbn.length() - 1) - '0';

        //Comparing checkdigits.
        return givenCheckDigit == checkDigit;
    }
}
