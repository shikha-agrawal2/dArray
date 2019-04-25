package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//HashMap- This implementation provides constant-time performance for the basic operations (get and put).
//TreeMap- provides guaranteed log(n) time cost for the containsKey, get, put and remove operations. A Red-Black tree based NavigableMap implementation
public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        //ConcurrentHashMap
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> it = myMap.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);

        //HashMap
        myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

        while(it1.hasNext()){
            String key = it1.next();
            if(key.equals("3")) {
                myMap.put(key+"new", "new3"); //Exception in thread "main" java.util.ConcurrentModificationException
               // myMap.put(key, "new3");
               // break;
            }

        }
        System.out.println("HashMap after iterator: "+myMap);
    }

}
