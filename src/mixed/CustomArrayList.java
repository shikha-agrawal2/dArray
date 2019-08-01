package mixed;

import java.util.ArrayList;

public class CustomArrayList {
	// the custom datatype class
	int n=4;
	//We create class for data that has to be inserted in list
	class Data{
		int roll;
		String name;
		
		Data(int roll, String name){
			this.roll = roll;
			this.name= name;
		}
	}
	
	public static void main(String args[]) {
		int roll[] = {1,2,3,4};
		String name[] = {"ABC", "DEF","GHI","JKL"};
		CustomArrayList custom = new CustomArrayList();
		custom.addValues(roll, name);
	}
   

	private void addValues(int[] roll, String[] name) {	
		ArrayList<Data> list = new ArrayList<>();
		for(int i=0; i<n;i++) {
			list.add(new Data(roll[i], name[i]));
		}
		printValues(list);
	}


	private void printValues(ArrayList<Data> list) {	
		for(int i=0; i<n;i++) {
		Data data = list.get(i);
		System.out.println(data.roll+" "+data.name);
		}
	}
}
