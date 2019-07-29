package stacks;

public class ImplementingStackUsingLinkedList {
    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        ImplementingStackUsingLinkedList stackUsingLinkedList = new ImplementingStackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        System.out.println(stackUsingLinkedList.pop()+" popped from stack");

    }
    StackNode root;

    private boolean push(int data) {
        StackNode node = new StackNode(data);
        if(root==null){
            root = node;
        }else {
            root.next = node;
            node.next=null;
        }
        return false;
    }

    private int pop() {
        return 0;
    }
}
