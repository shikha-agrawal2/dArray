package interviewquestions;
/*This question is tricky because unlike the Integer, where MIN_VALUE is negative, both the MAX_VALUE and MIN_VALUE of the Double class are positive numbers.
The Double.MIN_VALUE is 2^(-1074), a double constant whose magnitude is the least among all double values.
So unlike the obvious answer, this program will print 0.0 because Double.MIN_VALUE is greater than 0.

Read more: http://www.java67.com/2012/09/top-10-tricky-java-interview-questions-answers.html#ixzz5jkG5rWES*/
public class DoubleMinValue {
        public static void main(String[] args){
            System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // 0.0
            double v = 1.0 / 0.0;
            System.out.println(v);
            boolean b = 0.0d / 0.0 == Double.NaN;
            System.out.println(b);
        }
}

/*2. What will happen if you put return statement or System.exit () on try or catch block? Will finally block execute?
This is a very popular tricky Java question and it's tricky because many programmers think that no matter what,
but the finally block will always execute. This question challenge that concept by putting a return statement in the try or catch block or
 calling System.exit() from try or catch block. Answer of this tricky question in Java is that finally block will execute even if you put a
 return statement in the try block or catch block but finally block won't run if you call System.exit() from try or catch block. */

/*3. What will happen if we put a key object in a HashMap which is already there?
This tricky Java question is part of another frequently asked question, How HashMap works in Java.
HashMap is also a popular topic to create confusing and tricky question in Java. Answer of this question is if you put the same key again then it will replace the old mapping because HashMap doesn't allow duplicate keys. The Same key will result in the same hashcode and will end up at the same position in the bucket.

 Each bucket contains a linked list of Map.Entry object, which contains both Key and Value. Now Java will take the Key object from each entry and compare with this new key using equals() method, if that return true then value object in that entry will be replaced by new value*/


