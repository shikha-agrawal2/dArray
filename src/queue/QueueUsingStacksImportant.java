package queue;

import java.util.Stack;

public class QueueUsingStacksImportant {
    Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();

    public static void main(String[] args) {

        QueueUsingStacksImportant q = new QueueUsingStacksImportant();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }

    private int deQueue() {
        if (s1.isEmpty()) {
            System.exit(0);
        }
        Integer peek = s1.peek();
        s1.pop();
        return peek;
    }

    private void enQueue(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(x);
        }
    }
}
