package day1;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
