package string;
import java.io.*;
import java.util.*;
public class FindMinInsertionUsingDp {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        if(3<=n && n<=5000) {
            int output = getMinNoOfCharacters(word.toCharArray(), n);
            System.out.println(output);
        }
    }

    private static int getMinNoOfCharacters(char[] str, int n){
        int table[][] = new int[n][n];
        int l, h, gap;

        for (gap = 1; gap < n; ++gap)
            for (l = 0, h = gap; h < n; ++l, ++h)
                table[l][h] = (str[l] == str[h])?
                        table[l+1][h-1] :
                        (Integer.min(table[l][h-1],
                                table[l+1][h]) + 1);

        return table[0][n-1];

    }
}
