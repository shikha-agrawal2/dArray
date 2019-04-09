package string;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    class Node {
        int maxPrefixSum;
        int maxSuffixSum;
        int totalSum;
        int maxSubarraySum;

        Node left;
        Node right;

        Node() {
            maxPrefixSum = maxSuffixSum = maxSubarraySum = totalSum = Integer.MIN_VALUE;
        }
    };

    Node merge(Node leftChild, Node rightChild) {
        Node parentNode = new Node();
        parentNode.maxPrefixSum = Integer.max(leftChild.maxPrefixSum, leftChild.totalSum + rightChild.maxPrefixSum);

        parentNode.maxSuffixSum = Integer.max(rightChild.maxSuffixSum,
                rightChild.totalSum +
                        leftChild.maxSuffixSum);

        parentNode.totalSum = leftChild.totalSum +
                rightChild.totalSum;

        parentNode.maxSubarraySum = Integer.max(Integer.max(leftChild.maxSubarraySum, rightChild.maxSubarraySum), leftChild.maxSuffixSum + rightChild.maxPrefixSum);

        return parentNode;
    }

    void constructTreeUtil(Node[] tree, int arr[], int start,
                           int end, int index)
    {

        /* Leaf Node */
        if (start == end) {

            tree[index].totalSum = arr[start];
            tree[index].maxSuffixSum = arr[start];
            tree[index].maxPrefixSum = arr[start];
            tree[index].maxSubarraySum = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        constructTreeUtil(tree, arr, start, mid, 2 * index);
        constructTreeUtil(tree, arr, mid + 1, end, 2 * index + 1);

        // Merge left and right child into the Parent Node
        tree[index] = merge(tree[2 * index], tree[2 * index + 1]);
    }


    Node[] constructTree(int arr[], int n)
    {
        // Allocate memory for segment tree
        int x = (int)(Math.ceil(Math.log(n))); // Height of the tree


        int max_size = 2 * (int)Math.pow(2, x) - 1;
        Node[] tree = new Node[max_size];

        // Fill the allocated memory tree
        constructTreeUtil(tree, arr, 0, n - 1, 1);

        // Return the constructed segment tree
        return tree;
    }

    /* A Recursive function to get the desired
    Maximum Sum Sub-Array,
    The following are parameters of the function-

    tree	 --> Pointer to segment tree
    index --> Index of the segment tree Node
    ss & se --> Starting and ending indexes of the
                segment represented by
                    current Node, i.e., tree[index]
    qs & qe --> Starting and ending indexes of query range */
    Node queryUtil(Node[] tree, int ss, int se, int qs,
                   int qe, int index)
    {
        // No overlap
        if (ss > qe || se < qs) {

            // returns a Node for out of bounds condition
            return null;
        }

        // Complete overlap
        if (ss >= qs && se <= qe) {
            return tree[index];
        }

        // Partial Overlap Merge results of Left
        // and Right subtrees
        int mid = (ss + se) / 2;
        Node left = queryUtil(tree, ss, mid, qs, qe,
                2 * index);
        Node right = queryUtil(tree, mid + 1, se, qs,
                qe, 2 * index + 1);

        // merge left and right subtree query results
        Node res = merge(left, right);
        return res;
    }


    int query(Node[] tree, int start, int end, int n)
    {
        Node res = queryUtil(tree, 0, n - 1, start, end, 1);
        return res.maxSubarraySum;
    }

    int[] querySort(List<Integer> arr, List<Integer> l, List<Integer> r)
    {
        int[] ans = new int[arr.size()];
        Node[] nodes = arr.stream().map(a -> new Node()).collect(Collectors.toList()).toArray(new Node[arr.size()]);
        for(int i =0; i <= arr.size() - 1; i++) {

            int maxSubarraySum = query(nodes, l.get(i), r.get(i), arr.size());
            ans[i] = maxSubarraySum;
        }
        return ans;
    }

}
