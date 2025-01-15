package day2;

import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        for (int i = 1; i <= length; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println("Case #"+ i + ": " + A + " + " + B + " = " + (A + B));
        }
    }
}

