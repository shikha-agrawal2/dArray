package coreJava;

import java.util.LinkedHashMap;
import java.util.Map;
//http://sophiafeng.com/2013/11/21/lru-cache-implementation-by-linkedhashmap-leetcode/
public class LRUImplementation {
    MyLRU map;

    public LRUImplementation(int capacity) {
        this.map = new MyLRU(capacity);
    }

    public int get(int key) {
        if (map == null || map.get(key) == null) return -1;
        int value = map.get(key);
        map.remove(key);
        map.put(key, value);
        return value;
    }

    public void set(int key, int value) {
        if (map == null) return;
        get(key);
        map.put(key, value);
    }

    public static void main(String[] args) {
        LRUImplementation lru = new LRUImplementation(4);
        lru.set(1, 1);
        lru.set(2, 1);
        lru.set(3, 1);
        lru.set(4, 1);

        System.out.println(lru.map);

        lru.set(2, 2);

        System.out.println(lru.map);

        lru.set(5, 1);
        lru.set(6, 1);
        lru.set(7, 1);

        System.out.println(lru.map);
    }
}

class MyLRU extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public MyLRU(int capacity) {

        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
}
