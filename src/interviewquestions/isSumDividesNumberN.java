package interviewquestions;

public class isSumDividesNumberN {
    // Driver Code 
    public static void main(String args[])
    {
        int N = 12;

        if (isSumDivides(N) == 1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }

    private static int isSumDivides(int n) {
        int temp = n;
        int sum = 0;
        while(temp>0){
            sum += temp %10;
            temp/=10;
        }
        if(n % sum ==0){
            return 1;
        }
        else {
            return 0;
        }
    }
}
