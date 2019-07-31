package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.codechef.com/problems/IOPC1102
public class ChocolateDistribution {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int testCases = 0;
        if (s != null) {
            testCases = Integer.parseInt(s);
        }
        int[] result = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            String s1 = br.readLine();
            String[] split = s1.split("\\s");
            int M = Integer.parseInt(split[0]);
            int N = Integer.parseInt(split[1]);
            int P = Integer.parseInt(split[2]);
            int Q = Integer.parseInt(split[3]);
            int countChildren = countChildren(M, N, P, Q);
            result[i] = countChildren;
        }
        for (int p = 0; p < testCases; p++) {
            System.out.println(result[p]);
        }
    }
    //Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()){
//            int testCases = Integer.parseInt(sc.next());
//            int[] result = new int[testCases];
//            for (int i = 0; i < testCases; i++) {
//                int M = sc.nextInt();
//                int N = sc.nextInt();
//                int P = sc.nextInt();
//                int Q = sc.nextInt();
//                int countChildren = countChildren(M, N, P, Q);
//                result[i]=countChildren;
//            }
//            for(int p=0; p<testCases; p++){
//                System.out.println(result[p]);
//            }
//        }

//    }

    private static int countChildren(int m, int n, int p, int q) {
        int c = 0;
        for (int i = m; i <= n; i++) {
            for (int j = p; j <= q; j++) {
                int remainingRow =i, remainingColumn=j;
                while(true){
                    if(remainingRow==0 && remainingColumn==0) break;
                    if(remainingRow<remainingColumn){
                        remainingColumn = remainingColumn-remainingRow;
                        c++;
                    }
                    if(remainingRow>remainingColumn){
                        remainingRow= remainingRow-remainingColumn;
                        c++;
                    }
                    if(remainingRow==remainingColumn){
                        remainingRow=0;
                        remainingColumn=0;
                        c++;
                    }
                }
                //c += countRec(i, j);
            }
        }

        return c;
    }

    private static int countRec(int i, int j) {
        int count = 0;
        if (i == j) {
            count++;
            return count;
        }
        if (i < j) {
            return countRec(i, i) + countRec(i, j - i);
        } else {
            return countRec(j, j) + countRec(i - j, j);
        }
    }
}
