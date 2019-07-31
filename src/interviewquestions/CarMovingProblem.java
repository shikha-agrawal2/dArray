package interviewquestions;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class CarMovingProblem {
    Hashtable<Character, Integer> idealMap = new Hashtable<>();
    Hashtable<Character, Integer> givenMap = new Hashtable<>();
    static int changes = 0;

    public void getMiniumSwaps(List<Character> ideal, List<Character> given) {
        for (int i = 0; i < given.size(); i++) {
            idealMap.put(ideal.get(i), i);
            givenMap.put(given.get(i), i);
        }

        int blankIndex = getBlankIndex(given);
        while (true) {
            if (!isIndexCorrectlyParked(blankIndex, ideal, given)) {
                //blank is not correctly parked, get what car should be here at this index
                char ch = ideal.get(blankIndex);
                //find out where is it parked now
                final Integer idealIndex = givenMap.get(ch);
                swapCarsAtIndex(blankIndex, idealIndex, given);
                blankIndex = getBlankIndex(given);
            } else {
                //getFirstIncorrectlyParkedIndex
                int firstIncorrectlyParkedCarIndex = getFirstIncorrectlyParkedCarIndex(ideal, given);
                if (firstIncorrectlyParkedCarIndex == -1) {
                    break;
                } else {
                    swapCarsAtIndex(firstIncorrectlyParkedCarIndex, blankIndex, given);
                    blankIndex  = firstIncorrectlyParkedCarIndex;
                }
            }
        }
    }

    public void swapCarsAtIndex(int x, int y, List<Character> given) {
        final Character temp = given.get(x);
        given.set(x, given.get(y));
        given.set(y, temp);
        changes++;
        givenMap.put(given.get(x), x);
        givenMap.put(given.get(y), y);
        System.out.println(given);
    }

    public int getBlankIndex(List<Character> given) {

        return given.indexOf('_');
    }

    public boolean isIndexCorrectlyParked(int i, List<Character> ideal, List<Character> given) {
        if (i <= ideal.size() - 1 && i <= given.size() - 1)
            return ideal.get(i) == given.get(i);
        return false;
    }

    public int getFirstIncorrectlyParkedCarIndex(List<Character> ideal, List<Character> given) {
        for (int i = 0; i < ideal.size(); i++) {
            if (ideal.get(i) != given.get(i)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // new CarMovingProblem().getMiniumSwaps(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', '_'), Arrays.asList('A', '_', 'D', 'E', 'B', 'F', 'G', 'C'));
        final List<Character> given = Arrays.asList('D', 'F', 'E', 'A', 'G', 'C', 'B', '_');
        final List<Character> ideal = Arrays.asList('_','A','B','C','G','F','D','E');


        System.out.println(given);
        System.out.println("||");
        System.out.println(ideal);
        System.out.println("==================");
        new CarMovingProblem().getMiniumSwaps(ideal,given );
        System.out.println("swaps required: " + changes);
    }
}
