package techgig;

import java.util.Arrays;
import java.util.Scanner;

public class CandidateCode4 {
    private static long[][] dp = new long[1003][1003];
    private static int r, p;
    private static final int mod = 1000000007;

    public static void main(String[] args) throws Exception {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();

        while (testCases-- > 0) {
            r = scan.nextInt();
            p = scan.nextInt();
            if (1 <= r && r <= 1000 && 1 <= p && p <= r) {
                for (int i = 0; i < dp.length; i++) {
                    Arrays.fill(dp[i], -1);
                }
                long sol = warPossibility(0, 0) % mod;
                System.out.println(sol);
            }
        }
        scan.close();

    }

    static long warPossibility(int match, int arya) {
        int sansa = match - arya;

        if (arya < p * sansa) return 0;

        if (match == r) return 1;

        if (dp[match][arya] != -1)
            return dp[match][arya];

        long ans = ((warPossibility(match + 1, arya + 1) % mod) + (warPossibility(match + 1, arya) % mod)) % mod;

        return dp[match][arya] = ans;
    }


}
