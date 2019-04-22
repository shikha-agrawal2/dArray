package tree;

import utility.Node;
/*https://www.geeksforgeeks.org/symmetric-tree-tree-which-is-mirror-image-of-itself/
* https://www.youtube.com/watch?v=8t4KCaDB108
* */
public class SymmetricTree {
    Node root;
    private boolean isSymmetric(Node root) {

        return isSymmetric(root, root);
    }

    private boolean isSymmetric(Node node1, Node node2) {
        // if both trees are empty, then they are mirror image
        if(node1 == null && node2 == null)
            return true;
        //If one is empty, they are not
        if(node1==null || node2 == null)
            return false;
        //node1!=null && node2!=null
        // For two trees to be mirror images, the following three
        // conditions must be true
        // 1 - Their root node's key must be same
        // 2 - left subtree of left tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images
        if(node1.data == node2.data){
            return isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);
        }
        return false;
    }

    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean symmetric = tree.isSymmetric(tree.root);
        System.out.println(symmetric);
    }
}
