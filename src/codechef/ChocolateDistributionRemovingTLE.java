package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.codechef.com/problems/IOPC1102
public class ChocolateDistributionRemovingTLE {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuffer out = new StringBuffer("");
        long ar[][] = new long[1001][1001];
        long sum[][] = new long[1001][1001];
        for (int i = 1; i <= 1000; i++) {
            ar[i][1] = i;
            ar[i][0] = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    ar[i][j] = i / j;
                else
                    ar[i][j] = ar[j][i % j] + i / j;
            }
        }
        for (int i = 1; i <= 1000; i++) {
            sum[i][0] = ar[i][0];
            for (int j = 1; j < i; j++) {
                sum[i][j] = (sum[i][j - 1] + ar[i][j]);
            }
        }

        //System.out.println(sum[1000][999]);/*
        for (int i = 1; i <= t; i++) {
            long M, N, P, Q;
            StringTokenizer s = new StringTokenizer(br.readLine());
            M = Long.parseLong(s.nextToken());
            N = Long.parseLong(s.nextToken());
            P = Long.parseLong(s.nextToken());
            Q = Long.parseLong(s.nextToken());
            long S = 0;
            for (int j = (int) P; j <= (int) Q; j++) {

                long a = M / j;
                long b = N / j;
                long c = b - a - 1;
                int d = (int) M % j;
                int e = (int) N % j;
                if (j == 1) {
                    S += ((b * b + b - a * a + a) / 2);
                    continue;
                }
                if (c == -1) {
                    S += (a * (e - d + 1));
                    if (d > 0)
                        S += (sum[j][e] - sum[j][d - 1]);
                    else
                        S += (sum[j][e] - sum[j][d]);
                } else if (c == 0) {
                    S += (a * (j - d));
                    if (d > 0)
                        S += (sum[j][j - 1] - sum[j][d - 1]);
                    else
                        S += (sum[j][j - 1] - sum[j][d]);
                    S += (b * (e + 1));
                    S += (sum[j][e] - sum[j][0]);
                } else {
                    S += (a * (j - d));
                    //System.out.println("S="+S);
                    if (d > 0)
                        S += (sum[j][j - 1] - sum[j][d - 1]);
                    else
                        S += (sum[j][j - 1] - sum[j][d]);
                    //System.out.println("S="+S);
                    S += (b * (e + 1));
                    //System.out.println("S="+S);
                    S += (sum[j][e] - sum[j][0]);
                    //System.out.println("S="+S);
                    S += (((j) * (((b * (b + 1)) / 2) - b - ((a * (a + 1)) / 2))) + sum[j][j - 1] * c);
                    //System.out.println("S="+S);
                }

            }
            out.append(S + "\n");
        }//*/
        System.out.println(out);
    }
}
