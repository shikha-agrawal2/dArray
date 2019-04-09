package tree;

import utility.Node;
import utility.SampleBinaryTree;

public class InorderSuccessorBST {
    public static void main(String[] args) {
        Node root = SampleBinaryTree.sampleBinaryTree2();
       // Node node = inorderSuccessor(root, root.right);
        //System.out.println(node!=null ? node.data : null);
        Node node1 = inorderSuccessor(root, root.right.right);
        System.out.println(node1!=null ? node1.data : null);
        Node node2 = inorderSuccessor(root, root.left.right);
        System.out.println(node2!=null ? node2.data : null);
    }

    private static Node inorderSuccessor(Node root, Node x) {
       // Node node = searchNode(root, x);
        if(x.right!=null){
            return findMinimumLeftNode(x.right);
        }
        return findParent(root, x);
    }

    private static Node findParent(Node root, Node x) {
        Node successor = null;
        Node ancestor = root;
        while(ancestor.data!=x.data){
            if(x.data<ancestor.data) {
                successor = ancestor;
                ancestor = ancestor.left;
            }else if(x.data>ancestor.data){
                ancestor = ancestor.right;
            }
        }
        return successor;

    }

    private static Node findMinimumLeftNode(Node node) {
        //Node min = node;
        while(node!=null && node.left!=null){
            //min = node;
            node=node.left;
        }
        return node;
    }

    private static Node searchNode(Node root, int data) {
        if (root == null) return root;
        if(data==root.data) return root;
        if (data < root.data) {
            searchNode(root.left, data);
        } else if (data > root.data)
            searchNode(root.right, data);
        return root;
    }
}
