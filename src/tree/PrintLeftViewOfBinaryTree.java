package tree;

import utility.Node;

/*Print Left View of a Binary Tree
        Given a Binary Tree, print left view of it.
        Left view of a Binary Tree is set of nodes visible when tree is visited from left side.*/
public class PrintLeftViewOfBinaryTree {
    Node root;
     int  max_level = 0;


    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        PrintLeftViewOfBinaryTree tree = new PrintLeftViewOfBinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.leftView();
    }

    private void leftView() {
        leftViewRec(root, 1);
    }

    private void leftViewRec(Node node, int level) {

        if(node ==null) return;
        if(max_level< level){
            System.out.println(node.data);
            max_level = level;
        }
        leftViewRec(node.left, level+1);
        leftViewRec(node.right, level+1);
    }
}
