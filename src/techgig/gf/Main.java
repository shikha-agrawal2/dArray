package techgig.gf;

import java.util.ArrayDeque;
        import java.util.HashSet;
        import java.util.Queue;
        import java.util.Set;

// queue node used in BFS
class Node
{
    // (x, y) represents coordinates of a cell in matrix
    int x, y;

    // maintain a parent node for printing final path
    Node parent;

    Node(int x, int y, Node parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
};

public class Main {

    private static int N;
    private static int W=0;

    private static int[] row = { -1, 0, 0, 1, 1, -1, 1, -1};
    private static int[] col = { 0, -1, 1, 0, 1,  1, -1, -1};

    private static boolean isValid(int x, int y) {
        return (x >= 0 && x < N) && (y >= 0 && y < N);
    }

    public static void findPath(char matrix[][], int i, int j, char str[], int length, Set<String> visited)
    {
        if(length == str.length) {
            System.out.println(visited.toString());
            W++;
            return;
        }

        for (int k = 0; k < 8; k++)
        {
            int x = i + row[k];
            int y = j + col[k];
            if (isValid(x, y)) {
                if(matrix[x][y] == str[length]) {
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


    public static void main(String[] args)
    {

        String srt[] = {"fitfpoke", "orlignom", "ifefmart", "tforarts","tekkenth", "richieri", "tintinti", "pikachup"};
        char[][] matrix = new char[8][8];
        for(int i = 0; i <8; i++) {
            char strr[] = srt[i].toCharArray();
            for(int j = 0; j < 8 ; j++) {
                matrix[i][j] = strr[j];
            }
        }

        N = matrix.length;

        String word = "fit";
        char str[] = word.toCharArray();
        for(int i = 0; i< N ; i++) {
            for(int j= 0; j < N; j++) {
                if(matrix[i][j] == str[0]) {
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