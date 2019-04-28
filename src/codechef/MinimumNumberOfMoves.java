package codechef;
//code-SALARY, EASY
import java.io.IOException;

public class MinimumNumberOfMoves {

    public static void main(String[] args) throws IOException {
        java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s1 = r.readLine();
        int numberOfTestCases=0;
        try {
            if(s1!=null){
                 numberOfTestCases = Integer.parseInt(s1);
            }
            int[] result = new int[numberOfTestCases];
            for (int i = 0; i < numberOfTestCases; i++) {
                int n = Integer.parseInt(r.readLine());
                String s = r.readLine();
                String[] srr = s.split("\\s");
                int[]  arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = Integer.valueOf(srr[j]);
                }
                result[i]=minimumNumberOfOperations(arr);
            }
            for (int k=0; k<numberOfTestCases; k++){
                System.out.println(result[k]);
            }
        }catch (NumberFormatException e){

        }



        System.exit(0);
    }

    private static int minimumNumberOfOperations(int[] arr) {
        int sum = 0;
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small)
                small = arr[i];
            sum += arr[i];
        }
        return sum - (arr.length * small);
    }

}
