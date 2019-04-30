package codingGameSolutions.Easy;

import java.util.Scanner;

public class GhostLegs {
    public static void main(String[] args) {
        //Read diagram size.
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();

        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] T = in.nextLine().split("  ");
        int[] Ti = new int[T.length];

        for (int i = 0; i < Ti.length; i++) {
            Ti[i] = i;
        }

        for (int i = 0; i < H - 2; i++) {
            String line = in.nextLine();
            String[] line1 = line.split("\\|");
            for (int j = 0; j < line1.length; j++) {
                if (line1[j].equals("--")) {
                    for (int k = 0; k < Ti.length; k++) {
                        if (Ti[k] == j - 1) {
                            Ti[k] += 1;
                        } else if (Ti[k] == j) {
                            Ti[k] -= 1;
                        }
                    }
                }
            }
        }
        String[] B = in.nextLine().split("  ");
        for (int l = 0; l < Ti.length; l++) {
            System.out.println(T[l] + B[Ti[l]]);
        }

    }
}

//i/p-
//7 7
//A  B  C
//|  |  |
//|--|  |
//|  |--|
//|  |--|
//|  |  |
//1  2  3

