package yatraInterviewQuestions;

import utility.Node;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Res {
    int val;
}
class Solution {
    static class Node<T> {

        T label;
        T data;
        Node left, right;
        public Node(T item) {
            data = item;
              left = right = null;
        }
        List<Node<T>> nodes;
    }
//class Node<T> {
//
//    T data;
//    Node left, right;
//
//    public Node(T item) {
//        data = item;
//        left = right = null;
//    }
//}
    //static List<Node<Integer>> tree = new ArrayList<>();
public static int bestSumAnyTreePath(List<Integer> parent, List<Integer> values) {
    Node<Integer> binaryTree = createBinaryTree(parent, values, null);
    int maxSum = findMaxSum(binaryTree);
    return maxSum;
    // Write your code here


}



    // Returns maximum path sum in tree with given root
    static int findMaxSum(Node node) {

        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        maxSum(node, res);
        return res.val;
    }

    static class Result {
        public int val;
    }
    private static int maxSum(Node<Integer> btree, Res result) {

        if (btree == null)
            return 0;
        int l = maxSum(btree.left, result);
        int r = maxSum(btree.right, result);

        System.out.println(l + " " + r + " " + btree.data);
        int maxSingle = Math.max(Math.max(l, r) + btree.label, btree.label);
        int maxTop = Math.max(l + r + btree.label, maxSingle);

        result.val = Math.max(maxTop, result.val);
        return maxSingle;
    }

    private static Node<Integer> createBinaryTree(List<Integer> parent, List<Integer> values, Node<Integer> root) {
        Map<Integer, Node<Integer>> map = new HashMap<>();

        for (int i = 0; i < parent.size(); i++) {
            map.put(i, new Node<>(i));
        }

        for (int i = 0; i < parent.size(); i++) {
            if (parent.get(i) == -1) {
                root = map.get(i);
                root.label = values.get(i);
            } else {
                Node<Integer> par = map.get(parent.get(i));
                par.label = values.get(parent.get(i));
                Node<Integer> child = map.get(i);
                child.label = values.get(i);
                if (par.left == null) {
                    par.left = child;
                } else {
                    par.right = child;
                }
            }
        }
        return root;
    }

//    int adj[][] = new int[parent.size()][parent.size()];
//    createTree(parent, values, adj);
//    List<Integer> traversedNodes = new ArrayList<>();
//    List<Integer> sumOfraversedNodes = new ArrayList<>();
//
//        for (int i = 0; i < adj.length; i++) {
//        dfs(tree.get(i), traversedNodes, sumOfraversedNodes);
//        traversedNodes.clear();
//    }
//
//        System.out.println(sumOfraversedNodes);
//    private static void dfs(Node<Integer> tree, List<Integer> traversedNodes, List<Integer> sums) {
//        if (!traversedNodes.contains(tree.label)) {
//            traversedNodes.add(tree.label);
//            sums.add(getSum(traversedNodes));
//            for (Node<Integer> child : tree.nodes) {
//                dfs(child, traversedNodes, sums);
//            }
//        }
//    }
//
//    private static Integer getSum(List<Integer> traversedNodes) {
//        System.out.println(traversedNodes);
//        return traversedNodes.stream().reduce(0, Integer::sum);
//    }
//
//    private static void createTree(List<Integer> parent, List<Integer> values, int[][] adj) {
//
//        for (int i = 0; i < parent.size(); i++) {
//            Node<Integer> node = new Node<>();
//            node.label = i;
//            node.data = values.get(i);
//            node.nodes = new ArrayList<>();
//            tree.add(i, node);
//        }
//
//        for (int i = 0; i < parent.size(); i++) {
//            if (parent.get(i) != -1) {
//                adj[parent.get(i)][i] = 1;
//                adj[i][parent.get(i)] = 1;
//                tree.get(parent.get(i)).nodes.add(tree.get(i));
//            }
//        }
//
//        tree.forEach(t -> {
//            System.out.println(t.label);
//            System.out.println(t.nodes.stream().map(m -> m.label).collect(Collectors.toList()));
//        });
//        // System.out.println(Arrays.deepToString(adj));
//    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int parentCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> parent = IntStream.range(0, parentCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            int valuesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> values = IntStream.range(0, valuesCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            Solution.bestSumAnyTreePath(parent, values);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
           bufferedReader.close();
//            bufferedWriter.close();
        }

}
