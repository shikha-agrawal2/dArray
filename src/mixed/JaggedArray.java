package mixed;

//Program to demonstrate 2-D jagged array in Java
class JaggedArray
{
 public static void main(String[] args)
 {
	 // Program to demonstrate 2-D jagged array in Java
	/* int arr[][] = new int[2][];
	 arr[0] = new int[2];
	 arr[1] = new int[3];
	 int count =0;
	 for(int i=0; i<arr.length; i++) {
		 for(int j=0; j<arr[i].length; j++) {
			arr[i][j]= count ++; 
		 }
	 }
	 for(int i=0; i<arr.length; i++) {
		 for(int j=0; j<arr[i].length; j++) {
			 System.out.print(arr[i][j]+ " ");
		 }
		 System.out.println();
	 }
	 */
	// Another Java program to demonstrate 2-D jagged 
	// array such that first row has 1 element, second
	// row has two elements and so on.
	 int r=5;
	 int arr[][] = new int[r][];
	 for (int i=0; i<arr.length; i++)
         arr[i] = new int[i+1];
	 
	 int count =0;
	 for(int i=0; i<arr.length; i++) {
		 for(int j=0; j<arr[i].length; j++) {
			 arr[i][j]= count++;
		 }
	 }
	 for(int i=0; i<arr.length; i++) {
		 for(int j=0; j<arr[i].length; j++) {
			 System.out.print(arr[i][j]+ " ");
		 }
		 System.out.println();
	 }
 }
}