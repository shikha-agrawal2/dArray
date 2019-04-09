package graph;

import java.io.*;
import java.util.*;

public class TransformToPalindrome {
    public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
        }
        int l = sc.nextInt();
        Graph graph = new Graph(l);
        int arr[] = new int[l];
        for(int j=0; j<l; j++){
          arr[j] = sc.nextInt();
        }

    }

    private static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];
        Graph(int V){
            this.V = V;
            adjListArray = new LinkedList[V];
            for(int i = 0; i<V; i++){
                adjListArray[i]= new LinkedList<>();
            }
        }
    }
}
