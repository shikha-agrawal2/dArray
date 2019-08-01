package mixed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ReverseWordsInAGivenString {
	 public static void main(String[] args) throws NumberFormatException, IOException
	    {
	        /*String s1 = "Welcome.to.geeksforgeeks";
	        System.out.println(reverseWords(s1));
	 
	        String s2 = "I.love.Java.Programming";
	        System.out.println(reverseWords(s2));*/
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(reader.readLine());
			for(int i=0; i<n; i++){
			    System.out.println(reverseWords(reader.readLine()));
			}
	    }

	private static String reverseWords(String s1) {
		Pattern pattern = Pattern.compile("[.]");
		String[] temp = pattern.split(s1);
		String result="";
		for(int i= 0; i<temp.length; i++) {
			if(i==temp.length-1) {
				result= temp[i]+ result;
			}else {
				result="."+temp[i]+result;
			}
		}
		// TODO Auto-generated method stub
		return result;
	}
}
