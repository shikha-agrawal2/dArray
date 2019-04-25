package multithreading.internalImplementation;
//http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//It is not possible to insert null into a BlockingQueue. If you try to insert null, the BlockingQueue will throw a NullPointerException.
public class TestBlockingQueueInsertingNull {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        queue.put(null);
        System.out.println(queue);
    }
}
