package yatraInterviewQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {


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

    public static int bestSumAnyTreePath(List<Integer> parent, List<Integer> values) {
        Node<Integer> binaryTree = createBinaryTree(parent, values, null);
        int maxSum = findMaxSum(binaryTree);
        return maxSum;
    }

    static int findMaxSum(Node node) {

        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        maxSum(node, res);
        return res.val;
    }

    static class Res {
        public int val;
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

    private static int maxSum(Node<Integer> btree, Res result) {

        if (btree == null)
            return 0;
        int l = maxSum(btree.left, result);
        int r = maxSum(btree.right, result);

        int maxSingle = Math.max(Math.max(l, r) + btree.label, btree.label);
        int maxTop = Math.max(l + r + btree.label, maxSingle);

        result.val = Math.max(maxTop, result.val);
        return maxSingle;
    }

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

        int max = Result.bestSumAnyTreePath(parent, values);
        System.out.println(max);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
        bufferedReader.close();
//            bufferedWriter.close();
    }


}