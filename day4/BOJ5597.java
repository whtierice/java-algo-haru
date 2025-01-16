package day4;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[31];

        for (int i = 0; i < 28; i++) {
            int index = input.nextInt();
            scores[index]++;
        }

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 0) {
                System.out.println(i);
            }
        }


    }
}
