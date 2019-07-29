package tree;

import utility.Node;
//https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
public class IfBinaryTreeIsBSTOrNot {
    Node root;
    Node prev = null;
    public static void main(String[] args) {
        IfBinaryTreeIsBSTOrNot tree = new IfBinaryTreeIsBSTOrNot();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
       tree.isBST(tree.root);
        tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
//Recursive way
    private boolean isBST(Node root, int minValue, int maxValue) {
        if(root==null) return true;
        if(root.data<=minValue || root.data > maxValue){
            return false;
        }
        return isBST(root.left, minValue, root.data) &&
                isBST(root.right, root.data, maxValue);

    }

    private boolean isBST(Node node) {
        // traverse the tree in inorder fashion and
        // keep a track of previous node
        if (node != null)
        {
            if (!isBST(node.left))
                return false;

            // allows only distinct values node
            if (prev != null && node.data <= prev.data )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
    }
}
