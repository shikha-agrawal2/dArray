package techgig.grandfinale;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class CandidateCode {
    public static void main(String[] args) throws Exception {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        int result = 0;
        for (int i = 0; i < testCases; i++) {
            int N = scan.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                list.add(scan.nextInt());
            }
            int sum = 0;
            result += countGeekGoddess(list, sum);
            System.out.println(result);

        }

    }

    private static int countGeekGoddess(LinkedList<Integer> list, int sum) {
        for (int i = 0; i < list.size(); i++) {
            boolean win = true;
            if(win) {
            for (int j = i + 1; j < list.size(); j++) {
                if(win) {
                    if (list.get(i) < list.get(j)) {
                        win = false;

                    }
                }
                }
            }
            sum = win ? sum + 1 : sum + 0;
        }
        return sum;
    }
}
