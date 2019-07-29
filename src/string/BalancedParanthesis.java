package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        char exp[] = {'{', '(', ')', '}', '[', ']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    private static boolean areParenthesisBalanced(char[] exp) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : exp) {
            switch (bracket) {
                case '{':
                    stack.push(bracket); break;
                case '[':
                    stack.push(bracket); break;
                case '(':
                    stack.push(bracket); break;
                default:
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
