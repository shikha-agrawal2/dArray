package techgig.round2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CandidateCode2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            StringTokenizer tk = new StringTokenizer(bufferedReader.readLine());
            int R = Integer.parseInt(tk.nextToken());
            int P = Integer.parseInt(tk.nextToken());
            if (1 <= R && R <= 1000 && 1 <= P && P <= R) {
                resultList.add(winsPossibilitiesCounter(P, R));
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }

    }

    public static int winsPossibilitiesCounter(int p, int r) {
        int totalPossibilities = fight(p, 0, 0, p, r);
        return totalPossibilities % (10 ^ 9 + 7);
    }

    public static int fight(int aryaWins, int sansaWins, int possibilities, final int p, final int r) {
        if (aryaWins < sansaWins * p) {
            return possibilities;
        }
        if (aryaWins + sansaWins == r) {
            possibilities += 1;
            return possibilities;
        }
        return fight(aryaWins + 1, sansaWins, possibilities, p, r) + fight(aryaWins, sansaWins + 1, possibilities, p, r);
    }
}
