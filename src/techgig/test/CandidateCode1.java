package techgig.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CandidateCode1 {

    private static int N;
    private static int W = 0;

    private static int[] row = {-1, 0, 0, 1, 1, -1, 1, -1};
    private static int[] col = {0, -1, 1, 0, 1, 1, -1, -1};

    private static boolean isValid(int x, int y) {
        return (x >= 0 && x < N) && (y >= 0 && y < N);
    }

    public static void findPath(char matrix[][], int i, int j, char str[], int length, Set<String> visited) {
        if (length == str.length) {
            W++;
            return;
        }
        for (int k = 0; k < 8; k++) {
            int x = i + row[k];
            int y = j + col[k];
            if (isValid(x, y)) {
                if (matrix[x][y] == str[length]) {
                    String key = x + "," + y;
                    if (!visited.contains(key)) {
                        visited.add(key);
                        findPath(matrix, x, y, str, length + 1, visited);
                        visited.remove(key);
                    }
                }
            }
        }
        return;

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        if(L>=3 && L<=11){
            String word = scan.next().trim();
            String[] srt = new String[8];
            for (int i = 0; i < 8; i++) {
                srt[i] = scan.next();
            }

            char[][] matrix = new char[8][8];
            for (int i = 0; i < 8; i++) {
                char strr[] = srt[i].toCharArray();
                for (int j = 0; j < 8; j++) {
                    matrix[i][j] = strr[j];
                }
            }

            N = matrix.length;

            char str[] = word.toCharArray();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (matrix[i][j] == str[0]) {
                        Set<String> visited = new HashSet<>();
                        String key = i + "," + j;
                        visited.add(key);
                        findPath(matrix, i, j, str, 1, visited);

                    }
                }
            }
            System.out.println(W);
        }
    }


}

class Node {
    int x, y;
    Node parent;

    Node(int x, int y, Node parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }


}


