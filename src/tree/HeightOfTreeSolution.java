package tree;

import utility.Node;

import java.util.*;


class HeightOfTreeSolution {

    /*
    class Node1
        int data;
        Node1 left;
        Node1 right;
    */
    public static int height(Node root) {
//        if(root==null){
//            return -1;
//        }
//        return Math.max(height(root.left),height(root.right))+1;
        if(root ==null){
            return -1;  // return -1 not 0 ;
        }
        else{
            int lDepth = height(root.left);
            int rDepth = height(root.right);
            if(lDepth> rDepth){
                return lDepth+1;
            }
            else{
                return rDepth+1;
            }
        }
        // Write your code here.
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- >0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}