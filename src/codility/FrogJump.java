package codility;

public class FrogJump {
    public static void main(String[] args) {
        int solution = solution(10, 85, 30);
        System.out.println(solution);
        int solution1 = solution(1, 5, 2);
        System.out.println(solution1);
        int solution2 = solution(5, 105, 3);
        System.out.println(solution2);

    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        double a = (double) (Y - X) / D;
        return (int) Math.ceil(a);

    }

}
