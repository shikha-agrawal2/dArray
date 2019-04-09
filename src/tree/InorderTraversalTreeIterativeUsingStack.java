package tree;

import utility.Node;
import utility.SampleBinaryTree;

import java.util.Stack;
/*Inorder Tree Traversal without Recursion
* https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/ */
public class InorderTraversalTreeIterativeUsingStack {
    public static void main(String[] args) {
        //InorderTraversalTreeIterativeUsingStack tree = new InorderTraversalTreeIterativeUsingStack();
        //tree.root = new Node(1);
        Node root = SampleBinaryTree.sampleBinaryTree();
        inorder(root);
        MorrisTraversal(root);

    }

    private static void inorder(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        //traverse the tree
        while(curr!=null || stack.size()>0) {
         /* Reach the left most Node of the
            curr Node */
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            /* Current must be NULL at this point */
            curr = stack.pop();
            System.out.println(curr.data + " ");

        /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }

    static void MorrisTraversal(Node root)
    {
        Node current, pre;

        if (root == null)
            return;

        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            }
            else {
                /* Find the inorder predecessor of current */
                pre = current.left;
                while (pre.right != null && pre.right != current)
                    pre = pre.right;

                /* Make current as right child of its inorder predecessor */
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }

                /* Revert the changes made in if part to restore the
                    original tree i.e., fix the right child of predecssor*/
                else {
                    pre.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                } /* End of if condition pre->right == NULL */

            } /* End of if condition current->left == NULL*/

        } /* End of while */
    }
}
