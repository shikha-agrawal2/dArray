package tree;

import utility.Node;
import utility.SampleBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversalBST {
    public static void main(String[] args) {
        Node root = SampleBinaryTree.sampleBinaryTree1();
        breadthFirstTraversal(root);


    }

    private static void breadthFirstTraversal(Node root) {
        Queue queue = new LinkedList();
        queue.add(root);
        while(root!=null) {
            System.out.println(root.data);
            queue.add(root.left);
            queue.add(root.right);
            queue.remove();
            root = (Node) queue.element();
        }

//        Queue<Node> queue = new LinkedList<Node>();
//        queue.add(root);
//        while (!queue.isEmpty())
//        {
//
//            /* poll() removes the present head.
//            For more information on poll() visit
//            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
//            Node tempNode = queue.poll();
//            System.out.print(tempNode.data + " ");
//
//            /*Enqueue left child */
//            if (tempNode.left != null) {
//                queue.add(tempNode.left);
//            }
//
//            /*Enqueue right child */
//            if (tempNode.right != null) {
//                queue.add(tempNode.right);
//            }
//        }


    }

}
