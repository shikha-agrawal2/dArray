package utility;

public class SampleBinaryTree {
    public static Node sampleBinaryTree1(){
        Node node8 = new Node(8);
        Node node7 = new Node(7);
        Node node6 = new Node(6);
        Node node5 = new Node(5);
        Node node4 = new Node(4, node8, null);
        Node node3 = new Node(3, node6, node7);
        Node node2 = new Node(2, node4, node5);

        Node node1 = new Node(1, node2, node3);
        return node1;
    }

    public static Node sampleBinaryTree2() {
        Node node10 = new Node(10);
        Node node7 = new Node(7);
        Node node9 = new Node(9, node7, node10);
        Node node5 = new Node(5);
        Node node2 = new Node(2);
        Node node4 = new Node(4, node2, node5);

        Node node6 = new Node(6, node4, node9);
        return node6;
    }
    public static Node sampleBST1(){
        Node node4 = new Node(4);
        Node node9 = new Node(9);
        Node node14 = new Node(14);
        Node node12 = new Node(12, node9, node14);
        Node node8 = new Node(8, node4, node12);
        Node node22 = new Node(22);
        Node node20 = new Node (20, node8, node22);
        return  node20;

    }

    public static Node sampleBinaryTree(){
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node2 = new Node(2, node4, node5);
        Node node3 = new Node(3);
        Node node1 = new Node(1, node2, node3);
        return node1;
    }
}
