package codechef;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ChocDist {
    static Scanner in;
    static PrintWriter out;
    //	static String INPUT = "2 1 2 1 2 3 4 4 5";
//	static String INPUT = "1 99999999 100000000 1 1000";
    static String INPUT = "";

    static void solve() {
        int m = ni();
        int n = ni();
        int p = ni();
        int q = ni();
        long ct = counts(n, p, q) - counts(m - 1, p, q);
        out.println(ct);
    }

    static long counts(int n, int p, int q) {
        long ct = 0;
        for (int i = p; i <= q; i++) {
            int no = n % i;
            ct += (long) (n / i) * (n / i + 1) / 2 * (no + 1) + (long) (n / i - 1) * (n / i) / 2 * (i - 1 - no);
            ct += (long) bsum[i][i - 1] * (n / i);
            ct += bsum[i][no];
        }
        return ct;
    }

    static int count(int a, int b) {
        int ct = 0;
        while (b > 0) {
            int c = a;
            a = b;
            ct += c / b;
            b = c % b;
        }
        return ct;
    }

    static int[][] b = new int[1001][1001];
    static int[][] bsum = new int[1001][1001];

    public static void main(String[] args) throws Exception {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        for (int i = 1; i <= 1000; i++) {
            for (int j = i; j <= 1000; j++) {
                b[i][j] = b[j][i] = count(i, j);
            }
        }
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                bsum[i][j] = bsum[i][j - 1] + b[i][j];
            }
        }

        int T = ni();
        for (int i = 0; i < T; i++) {
            solve();
        }
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }
}

