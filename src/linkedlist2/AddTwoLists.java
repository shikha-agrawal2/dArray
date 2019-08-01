package linkedlist2;

public class AddTwoLists {
    Node head1 = null;
    Node head2 = null;
    Node result = null;
    int carry = 0;

    public static void main(String[] args) {
        AddTwoLists list = new AddTwoLists();

        int arr1[] = { 9, 9, 9 };
        int arr2[] = { 1, 8 };
        for(int i=arr1.length-1; i>=0 ; i--)
            list.push(arr1[i], 1);
        for(int j= arr2.length-1; j>=0; j--){
            list.push(arr2[j], 2);
        }
        list.addLists();

    }

    private void addLists() {
        if(head1==null){
            result = head2;
            return;
        }
        if(head2 ==null){
            result = head1;
            return;
        }
        int size1 = getSize(head1);
        int size2 = getSize(head2);
        if(size1==size2){
            addSameSize(head1, head2);
        }
        else{
            // First list should always be larger than second list.
            // If not, swap pointers
            if(size1<size2){
                Node temp = head1;
                head1 = head2;
                head2 = temp;
            }
            int diff = Math.abs(size1-size2);

        }
    }

    private void addSameSize(Node head1, Node head2) {

    }

    private int getSize(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.nextNode;
        }
        return count;
    }

    private void push(int val, int listNumber) {
        Node newNode = new Node(val);
        if(listNumber==1){
            newNode.nextNode = head1;
            head1 = newNode;
        }else if(listNumber==2){
            newNode.nextNode = head2;
            head2 = newNode;
        }else {
            newNode.nextNode = result;
            result = newNode;
        }
    }

}
