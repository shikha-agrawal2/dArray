package stacks;
//https://www.geeksforgeeks.org/sorting-array-using-stacks/
import java.util.Stack;

public class SortingArraysUsingStack {
    public static void main(String[] args) {
        int []arr = {10, 5, 15, 45};
        int n = arr.length;

        sortArrayUsingStacks(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void sortArrayUsingStacks(int[] arr, int n) {
        Stack<Integer> inputStack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            inputStack.push(arr[i]);
        }
        Stack<Integer> out = sortArray(inputStack);
        for(int i=0; i<out.size(); i++){
            arr[i] = out.peek();
            out.pop();
        }
    }

    private static Stack<Integer> sortArray(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();
        while(!inputStack.isEmpty()){
            int temp = inputStack.peek();
            inputStack.pop();
            while(!tempStack.empty() && tempStack.peek()< temp){
                inputStack.push(tempStack.peek());
                tempStack.pop();
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
}
