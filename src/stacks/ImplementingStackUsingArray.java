package stacks;

//Stack is a linear data structure which follow LIFO(Last in first out) or FILO(First in Last out)
//Pros: Easy to implement. Memory is saved as pointers are not involved.
//Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.
public class ImplementingStackUsingArray {
    public static void main(String[] args) {
        ImplementingStackUsingArray stackUsingArray = new ImplementingStackUsingArray();
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        System.out.println(stackUsingArray.pop()+" Popped from stack");
        System.out.println(stackUsingArray.peek());
    }

    int top;
    int MAX = 1000;
    int[] arr = new int[MAX];

    ImplementingStackUsingArray() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return false;
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return arr[top--];

        }
    }

    boolean isEmpty(){
        return (top<0);
    }
    int peek() {
        return arr[top];
    }

}
