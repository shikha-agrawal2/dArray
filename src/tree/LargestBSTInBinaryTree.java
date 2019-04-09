package tree;

import utility.Node;

public class LargestBSTInBinaryTree {
    /**
     * Object of this class holds information which child passes back
     * to parent node.
     */
    class MinMax {
        int min;
        int max;
        boolean isBST;
        int size;

        MinMax() {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            isBST = true;
            size = 0;
        }
    }
    public static void main(String args[]){
        LargestBSTInBinaryTree lbi = new LargestBSTInBinaryTree();
//       int largestBSTSize = lbi.largestBST(root);
//        System.out.println("Size of largest BST  is " + largestBSTSize);
//        assert largestBSTSize == 8;
    }
}