package string;

//Write a program to get an int value as argument and return it as string. For example, if I give the number 3456 as int,
// it should return the same number 3456 but as an object of String. You cannot use Java API methods.
public class ConvertIntToStringWithoutJavaApiMethods {
    public static void main(String[] args) {
        String convert = convert(3456);
        System.out.println(convert);

    }

    private static String convert(int i) {
        //return Integer.toString(i); //Using Java API Method
        //return ""+i;      //Method1
        //Method2 using StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append(i);
        return builder.toString();

    }
}
