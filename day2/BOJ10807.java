package day2;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] ints = new int[size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            ints[i] = input.nextInt();
        }

        int num = input.nextInt();

        for (int i = 0; i < size; i++) {
            if (ints[i] == num) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
