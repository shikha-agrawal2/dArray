package coreJava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutReturnValue {
	public static void main(String[] args) {
		HashMap<Integer, String> xyz= new HashMap<>();
		xyz.put(1, "ABC");
		xyz.put(2, "XYZ");
		xyz.put(1, "FDE");
		for(Map.Entry<Integer, String> entry: xyz.entrySet()) {
			System.out.println(entry.getKey()+ ","+ entry.getValue());
		}
	}

}
