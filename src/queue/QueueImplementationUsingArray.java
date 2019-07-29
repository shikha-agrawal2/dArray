package queue;
//https://www.geeksforgeeks.org/queue-set-1introduction-and-array-implementation/
public class QueueImplementationUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Dequed item" + queue.dequeue());
        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
    }
}

class Queue {
    int capacity;
    int front, rear, size;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = this.capacity - 1;
        this.array = new int[this.capacity];
    }

    private boolean isFull(Queue queue) {
        return queue.size == queue.capacity;
    }

    private boolean isEmpty(Queue queue) {
        return queue.size == 0;
    }

    public void enqueue(int item) {
        if (isFull(this)) return;
        this.rear = (this.rear + 1) % this.capacity;  //important step
        array[rear] = item;
        this.size = this.size + 1;
    }

    public int dequeue() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;  //important step
        this.size = this.size - 1;
        return item;
    }

    int front() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return array[this.front];
    }

    int rear() {
        if (isEmpty(this)) return Integer.MIN_VALUE;
        return array[this.rear];
    }
}
