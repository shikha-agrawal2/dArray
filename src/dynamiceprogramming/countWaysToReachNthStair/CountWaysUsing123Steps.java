package dynamiceprogramming.countWaysToReachNthStair;
//https://www.geeksforgeeks.org/count-ways-reach-nth-stair-using-step-1-2-3/
public class CountWaysUsing123Steps {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findStep(n));
        System.out.println(findStepUsingDP(n));
    }
//Method 1
    private static int findStep(int n) {
        if (n == 1 || n == 0) return 1;
        else if (n == 2) return 2;
        else return findStep(n - 1) + findStep(n - 2) + findStep(n - 3);
    }

    //Method 2 Using DP
    private static int findStepUsingDP(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        result[2]= 2;
        for(int i=3; i<=n; i++){
            result[i] = result[i-1]+ result[i-2]+ result[i-3];
        }

        return result[n];
    }
}
