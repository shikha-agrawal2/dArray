package tree;

import utility.Node;

/*Print Right View of a Binary Tree
        Given a Binary Tree, print right view of it.
        Right view of a Binary Tree is set of nodes visible when tree is visited from right side.*/
/*A simple solution is to do level order traversal and print the last node in every level.*/
public class PrintRightViewOfBinaryTree {
    Node root;
     int  max_level = 0;


    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        PrintRightViewOfBinaryTree tree = new PrintRightViewOfBinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.rightView();
    }

    private void rightView() {
        rightViewRec(root, 1);
    }

    private void rightViewRec(Node node, int level) {

        if(node == null) return;
        if(max_level< level){
            System.out.println(node.data);
            max_level = level;
        }
        rightViewRec(node.right, level+1);
        rightViewRec(node.left, level+1);
    }
}
