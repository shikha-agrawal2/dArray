package hackerrank;

//https://www.hackerrank.com/challenges/balanced-brackets/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
       // String s = s1.replaceAll("\\w", "");  //To replace characters if String contains words and brackets
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else stack.push(s.charAt(i));
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else stack.push(s.charAt(i));
                    break;
                case ')':
                    if ( !stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else stack.push(s.charAt(i));
                    break;

            }
        }
        return stack.isEmpty() ? "YES" : "NO";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);

            //   bufferedWriter.write(result);
            //  bufferedWriter.newLine();
        }

        // bufferedWriter.close();

        scanner.close();
    }
}


//3
//{(([])[])[]}
//{(([])[])[]]}
//{(([])[])[]}[]
//Your Output (stdout)
//YES
//NO
//YES
//2
//{{([])}}
//{{)[](}}
//Your Output (stdout)
//YES
//NO
//3
//{[()]}
//{[(])}
//{{[[(())]]}}
//Your Output (stdout)
//YES
//NO
//YES
//important test case so we should check for stack is empty before checking stack.peek()
//6
//}][}}(}][))]
//[](){()}
//()
//({}([][]))[]()
//{)[](}]}]}))}(())(
//([[)