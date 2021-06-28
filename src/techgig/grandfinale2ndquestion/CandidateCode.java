package techgig.grandfinale2ndquestion;

import java.io.*;
import java.util.*;

/*public class CandidateCode {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        String word = scan.next().trim();
        char[] str = word.toCharArray();
        int N=8;
        char matrix[][] = new char[8][8];
        for (int i = 0; i < N; i++) {
            char[] arr = scan.next().trim().toCharArray();
            matrix[i] = arr;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(matrix[i][j]==str[0]){
                    Node node = findPath(matrix, i, j, str, str.length);
                }
            }
        }
       // System.out.println("W: " + W);
    }

    private static Node findPath(char[][] matrix, int x, int y, char[] str, int length) {
        Queue<Node> queue = new ArrayDeque<>();
        Node source = new Node(x, y, null);
        queue.add(source);

        Set<String> visited = new HashSet<>();
        String key = source.x + ","+ source.y;
        visited.add(key);
        length--;
        while (!queue.isEmpty()){
            Node n = queue.poll();
        }
        return null;
    }


}
class Node{

    int x, y;
    Node parent;
    Node(int x, int y, Node parent){
        this.x=x;
        this.y=y;
        this.parent=parent;
    }


}*/


