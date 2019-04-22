package maths;

public class Rand7FromRand5 {
    public static void main(String[] args) {
        generateRandom7FromRandom5WithEqualProabability();
    }

    private static int random5(){
        // code for random 5
        return 0;
    }

    private static int generateRandom7FromRandom5WithEqualProabability() {
        int i = 5*random5()+ random5()-5;
        return (i%7)+1;
    }
}

