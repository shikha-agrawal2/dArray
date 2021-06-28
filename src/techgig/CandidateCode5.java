package techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CandidateCode5 {
    private static long[][] dp = new long[1003][1003];
    private static int r, p;
    private static final int mod = 1000000007;

    public static void main(String[] args) throws Exception {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        if(testCases<=10 && testCases>=1) {
            while (testCases-- > 0) {
                r = scan.nextInt();
                p = scan.nextInt();
                for (int i = 0; i < dp.length; i++) {
                    Arrays.fill(dp[i], -1);
                }
                if (1 <= r && r <= 1000 && 1 <= p && p <= r) {
                    long sol = warPossibility(0, 0) % mod;
                    System.out.println(sol);
                }
            }
        }
        scan.close();

    }

    static long warPossibility(int match, int arya) {


//        int sansa = match - arya;
//
//        if (arya < p * sansa) return 0;
//
//        if (match == r) return 1;
//
//        if (dp[match][arya] != -1)
//            return dp[match][arya];
//
//        long ans = ((warPossibility(match + 1, arya + 1) % mod) + (warPossibility(match + 1, arya) % mod)) % mod;
//
//        return dp[match][arya] = ans;

        for (int i = r; i >=0 ; i--) {
            for (int j = i; j >=0; j--) {
                int sansa = i-j;

                if (j < p * sansa) {
                    dp[i][j]=0;
                }
                else if(i==r) {
                    dp[i][j]=1;
                }
                else {
                    dp[i][j]=(dp[i+1][j+1]%mod + dp[i+1][j]%mod)%mod;
                }
            }

        }
        return dp[0][0];
    }


}
