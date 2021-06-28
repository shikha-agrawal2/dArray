package java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
//https://www.geeksforgeeks.org/convert-set-stream-java/
//Note : Objects that you insert in HashSet are not guaranteed
// to be inserted in same order. Objects are inserted based on their hash code.
public class HashSetToStream {
    public static void main(String[] args) {
        // Creating an Integer HashSet
        Set<Integer> set = new HashSet<>();

        // adding elements in set
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(12);
        // converting Set to Stream
        Stream<Integer> stream = set.stream();

        // displaying elements of Stream using lambda expression
        stream.forEach(elem->System.out.print(elem+" "));


        // Creating an String HashSet
        Set<String> set2 = new HashSet<>();

        // adding elements in set
        set2.add("Geeks");
        set2.add("for");
        set2.add("GeeksQuiz");
        set2.add("GeeksforGeeks");

        // converting Set to Stream
        Stream<String> stream2 = set2.stream();

        // displaying elements of Stream
        System.out.println("");
        System.out.println("HashSet of String");
        stream2.forEach(elem -> System.out.print(elem+" "));

    }
}

/*o/p-
2 4 6 8 10 12
HashSet of String
GeeksforGeeks Geeks for GeeksQuiz */