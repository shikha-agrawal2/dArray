package multithreading.internalImplementation;
//Blocking queue is queue A blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty,
// or if you try to enqueue items to it and the queue is already full.
//A blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty, or if you try to enqueue items to it and the queue is already full.

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
    private List queue = new LinkedList();
    private int limit = 10;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while(this.queue.size()==limit) wait();
        if(this.queue.size()==0){
            notifyAll();
        }
        this.queue.add(item);
    }
    public synchronized Object dequeue() throws InterruptedException {
        while(this.queue.size()==0) wait();
        if(this.queue.size()==this.limit){
            notifyAll();
        }
        return this.queue.remove(0);
    }
}
