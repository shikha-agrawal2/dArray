package tree;

import utility.Node;

public class DeleteBinarySearchTree {
    // Root of BST 
    Node root;

    public DeleteBinarySearchTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        DeleteBinarySearchTree tree = new DeleteBinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        tree.deleteKey(20);

    }
    int minValue(Node root){
        int minValue=root.data;
        while(root.left!=null){
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    private void deleteKey(int data) {
        deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        /* Base Case: If the tree is empty */
        if(root ==null) return root;
//        if(data<root.data){
//            //deleteRec();
//        }
return null;
    }

    private void insert(int data) {
        root = insertRec(root, data);

    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

}
