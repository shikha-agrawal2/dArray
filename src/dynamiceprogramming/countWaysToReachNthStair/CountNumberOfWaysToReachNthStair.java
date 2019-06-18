package dynamiceprogramming.countWaysToReachNthStair;
//A person can climb either 1 stair or 2 stairs at a time.
//https://www.geeksforgeeks.org/count-ways-reach-nth-stair/

public class CountNumberOfWaysToReachNthStair {
    public static void main (String args[])
    {
        int s = 4;
        System.out.println("Number of ways = "+ countWays(s));
    }

    private static int countWays(int s) {

        return fibonacci(s+1);
    }

    private static int fibonacci(int n) {
        if(n<=1)
            return n;

        return fibonacci(n-1)+ fibonacci(n-2);
    }

}
