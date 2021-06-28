package techgig.round2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CandidateCode3 {
    public static void main(String[] args) throws Exception {
        int testCases = 0;
        Scanner scan = new Scanner(System.in);
        testCases = scan.nextInt();
        List<Long> resultList = new ArrayList<>();

        while (testCases-- > 0) {
            int rounds = scan.nextInt();
            long[][] dpArray = new long[rounds + 1][rounds + 1];
            int ptimes = scan.nextInt();

            if (1 <= rounds && rounds <= 1000 && 1 <= ptimes && ptimes <= rounds) {
                for (int i = 0; i <= rounds; i++) {
                    for (int j = 0; j <= rounds; j++) {
                        dpArray[i][j] = -1;
                    }
                }
                resultList.add(winsPossibilitiesCounterForArya(ptimes, rounds, dpArray));
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
        scan.close();

    }

    public static long winsPossibilitiesCounterForArya(int p, int r, long[][] dpArray) {
        dpArray[p][0]=war(0, 0, 0, p, r, dpArray);
        long res = dpArray[p][0];
        res %= 1000000007;
        return res;
    }

    public static long war(int match, int arya, int p, int r, long[][] dp) {
        int sansa = match-arya;
        if(arya < p * sansa) return 0;

        if(match == r) return 1;

        if(dp[match][arya] != -1)
            return dp[match][arya];
        long p1 = war(match + 1, arya + 1, p, r, dp)%1000000007;
        long p2 = war(match + 1, arya, p, r, dp)%1000000007;
        long ans = (p1 + p2)%1000000007;

        return dp[match][arya] = ans;
    }

    public static long war(int aryaStarkWins, int sansaStarkWins, long chances, final int p, final int r, long[][] dpArray) {



        if (dpArray[aryaStarkWins][sansaStarkWins] != -1) {
            return dpArray[aryaStarkWins][sansaStarkWins];
        }
        if (aryaStarkWins < sansaStarkWins * p) {
            return 0;
        }

        if (aryaStarkWins + sansaStarkWins == r) {
            return 1;
        }
        dpArray[aryaStarkWins][sansaStarkWins] = (war(aryaStarkWins + 1, sansaStarkWins, chances, p, r, dpArray) % 1000000007 + war(aryaStarkWins, sansaStarkWins + 1, chances, p, r, dpArray) % 1000000007) % 1000000007;

        return dpArray[aryaStarkWins][sansaStarkWins];
    }

}
