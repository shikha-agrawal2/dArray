package mixed;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountFreqInArray {

	public static void main(String[] args) {
		int arr[]= {3, 5,10, 1, 2 ,10, 2, 2,6,0,8,9,10, 76, 5, 4, 4};
		printFreq(arr);
	}

	private static void printFreq(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap= new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			Integer c= hmap.get(arr[i]);
			if(hmap.get(arr[i])==null) {
				hmap.put(arr[i], 1);
			}
			else {
				hmap.put(arr[i],++c);
			}
		}
		for(Map.Entry<Integer, Integer> m: hmap.entrySet()) {
			System.out.println("Frequency of "+m.getKey()+" : "+m.getValue());
		}
		
	}

}
