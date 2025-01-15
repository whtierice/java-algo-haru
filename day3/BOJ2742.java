package day3;

import java.util.Scanner;

public class BOJ2742 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(num - i);
        }
    }
}
