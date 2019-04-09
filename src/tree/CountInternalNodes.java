package tree;

import utility.Node;

public class CountInternalNodes {
    /* Driver program to test size function*/
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(countNonleaf(root));
    }

    private static int countNonleaf(Node root) {
            if(root==null || root.left == null && root.right==null){
                return 0;
            }
            return 1+ countNonleaf(root.left) + countNonleaf(root.right);
    }
}
