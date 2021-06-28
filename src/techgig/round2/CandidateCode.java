package techgig.round2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class CandidateCode {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            StringTokenizer tk = new StringTokenizer(bufferedReader.readLine());
            int R = Integer.parseInt(tk.nextToken());
            int P = Integer.parseInt(tk.nextToken());
            if (1 <= R && R <= 1000 && 1 <= P && P <= R) {
                int dp[][] = new int[1003][1003];
                for(int x=0;x<dp.length;x++)
                    Arrays.fill( dp[x], -1);
                resultList.add(f(0, 0, P, R, dp));
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }

    }

    private static Integer f(int match, int arya, int p, int r, int[][] dp) {
        int sansa = match-arya;
        if(arya < p * sansa) return 0;

        if(match == r) return 1;

        if(dp[match][arya] != -1)
            return dp[match][arya];
        Long p1 = new Long(f(match + 1, arya + 1, p, r, dp));
        Long p2 = new Long(f(match + 1, arya, p, r, dp));
        Long ans = p1 + p2;
        ans %= (10 ^ 9 + 7);

        return dp[match][arya] = ans.intValue();
    }



}
