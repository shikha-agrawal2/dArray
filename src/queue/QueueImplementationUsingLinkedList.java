package queue;

public class QueueImplementationUsingLinkedList {
    public static void main(String[] args) {
    QueueLL queueLL = new QueueLL();
    queueLL.enqueue(10);
    queueLL.enqueue(20);
    queueLL.dequeue();
    queueLL.dequeue();
    queueLL.enqueue(30);
    queueLL.enqueue(40);
    queueLL.enqueue(50);
        System.out.println("Dequeued item is "+ queueLL.dequeue().key);
    }
}
class QNode{
    int key;
    QNode next;
    public QNode(int key){
        this.key = key;
    }
}

class QueueLL{
    QNode front, rear;
    public QueueLL(){
        this.front=this.rear =null;
    }
    void enqueue(int key){
        QNode node = new QNode(key);
        // If queue is empty, then new node is front and rear both
        if(this.rear==null){
            this.front=this.rear=node;
            return;
        }
        // Add the new node at the end of queue and change rear
        this.rear.next=node;
        this.rear=node;
    }
    QNode dequeue(){
        if(this.front==null) return null;
        QNode temp = this.front;
        this.front=this.front.next;

        if(this.front==null){
            this.rear = null;
        }
        return temp;
    }

}
