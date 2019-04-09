package interviewquestions;

public class LinkedList {
    Node head;


    /* Drier program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        llist.printList();

       llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();
    }

    private void removeDuplicates() {
        Node current = head;
        while(current!=null){
            
        }
    }

    private void printList() {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp= temp.next;
        }
    }

    private void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
