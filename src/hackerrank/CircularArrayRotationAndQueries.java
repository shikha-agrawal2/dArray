package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/circular-array-rotation/problem
public class CircularArrayRotationAndQueries {
    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] arr = new int[a.length];
        int w = 0;

        for (int j = 0; j < a.length; j++) {
            if (j + k < a.length)
                arr[j + k] = a[j];
            else
            {  w = (j + k) % (a.length);
                arr[w] = a[j];
            }
        }
        int[] result = new int[queries.length];
        for(int l=0; l<queries.length; l++){
            result[l]= arr[queries[l]];
        }
        return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
         //   bufferedWriter.write(String.valueOf(result[i]));

//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
        }

       // bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
/* i/p-
51 51 100
39356 87674 16667 54260 43958 70429 53682 6169 87496 66190 90286 4912 44792 65142 36183 43856 77633 38902 1407 88185 80399 72940 97555 23941 96271 49288 27021 32032 75662 69161 33581 15017 56835 66599 69277 17144 37027 39310 23312 24523 5499 13597 45786 66642 95090 98320 26849 72722 37221 28255 60906
47
10
12
13
6
29
22
17
7
3
30
45
1
21
50
17
25
42
5
6
47
2
24
1
6
14
24
43
7
2
35
3
13
22
16
19
0
12
10
32
41
14
1
42
35
0
9
34
17
14
15
38
17
13
40
48
27
38
41
8
14
25
11
27
47
2
20
22
39
4
28
29
43
29
21
1
4
4
10
46
43
50
33
34
12
47
32
13
8
47
22
23
21
33
24
43
35
19
39
24
 */