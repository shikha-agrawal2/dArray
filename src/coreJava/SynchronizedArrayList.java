package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//https://www.geeksforgeeks.org/synchronization-arraylist-java/
public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        list.add("practice");
        list.add("code");
        list.add("quiz");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
