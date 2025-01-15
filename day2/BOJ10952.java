package day2;

import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int x = input.nextInt();
            int y = input.nextInt();

            if (x == 0 && y == 0) {
                break;
            }
            System.out.println(x + y);
        }


    }
}
