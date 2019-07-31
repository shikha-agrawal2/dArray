package codechef;

import java.io.*;

class CandidateCode {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer("");
        long ar[][] = new long[201][201];
        long sum[][] = new long[201][201];
        for (int i = 1; i <= 200; i++) {
            ar[i][1] = i;
            ar[i][0] = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    ar[i][j] = i / j;
                else
                    ar[i][j] = ar[j][i % j] + i / j;
            }
        }
        for (int i = 1; i <= 200; i++) {
            sum[i][0] = ar[i][0];
            for (int j = 1; j < i; j++) {
                sum[i][j] = (sum[i][j - 1] + ar[i][j]);
            }
        }

        String s1 = br.readLine();
        int M = Integer.parseInt(s1);
        String s2 = br.readLine();
        int N = Integer.parseInt(s2);
        String s3 = br.readLine();
        int P = Integer.parseInt(s3);
        String s4 = br.readLine();
        int Q = Integer.parseInt(s4);
        int S = 0;
        for (int j = P; j <= Q; j++) {

            int a = M / j;
            int b = N / j;
            int c = b - a - 1;
            int d = M % j;
            int e = N % j;
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

                if (d > 0)
                    S += (sum[j][j - 1] - sum[j][d - 1]);
                else
                    S += (sum[j][j - 1] - sum[j][d]);

                S += (b * (e + 1));

                S += (sum[j][e] - sum[j][0]);

                S += (((j) * (((b * (b + 1)) / 2) - b - ((a * (a + 1)) / 2))) + sum[j][j - 1] * c);

            }

        }
        stringBuffer.append(S);
        System.out.print(stringBuffer);
    }

}

