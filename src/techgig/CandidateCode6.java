package techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CandidateCode6 {
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
            for (int i = 0; i <= r; i++) {
                Arrays.fill(dp[i], -1);
            }
            long sol = warPossibility(0, 0)%mod;
            System.out.println(sol);
        }
        scan.close();

    }

    static long warPossibility(int match, int arya) {

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
