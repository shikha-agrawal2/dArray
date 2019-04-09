package tree;


import utility.Node;
import utility.SampleBinaryTree;

/*Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in
        T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

        The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root.*/
        /*We can recursively traverse the BST from root. The main idea of the solution is, while traversing from top to bottom,
        the first node n we encounter with value between n1 and n2,
        i.e., n1 < n < n2 or same as one of the n1 or n2, is LCA of n1 and n2 (assuming that n1 < n2).*/
        /*Time complexity of above solution is O(h) where h is height of tree. Also, the above solution
        requires O(h) extra space in function call stack for recursive function calls. We can avoid extra space using iterative solution.*/
public class LCAOfBinarySearchTree {
    public static void main(String[] args) {
        Node root = SampleBinaryTree.sampleBST1();
        int n1 = 10, n2 = 14;
        Node t = lcaIterative(root, n1, n2);
        System.out.println("LCA of "+ n1+ "& "+n2+ "="+ t.data);
        n1 = 14;
        n2 = 8;
        t = lcaIterative(root, n1, n2);
        System.out.println("LCA of "+ n1+ "& "+n2+ "="+ t.data);
        n1 = 10;
        n2 = 22;
        t = lcaIterative(root, n1, n2);
        System.out.println("LCA of "+ n1+ "& "+n2+ "="+ t.data);
    }
    /* Function to find LCA of n1 and n2. The function assumes that both
           n1 and n2 are present in BST */
    private static Node lcaRecursive(Node root, int n1, int n2) {
        if(root == null){
            return null;
        }
        if(root.data> n1 && root.data>n2){
            return lcaRecursive(root.left, n1, n2);
        }
        if(root.data<n1 && root.data< n2){
            return lcaRecursive(root.right, n1, n2);
        }
        return root;
    }

    private static Node lcaIterative(Node root, int n1, int n2) {
        while(root!=null){
            if(root.data> n1 && root.data>n2){
                root= root.left;
            }
            else if(root.data<n1&& root.data<n2){
                root=root.right;
            }
            else break;
        }
        return root;
    }
}
