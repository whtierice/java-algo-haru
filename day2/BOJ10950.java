package day2;

import java.util.Scanner;

public class BOJ10950 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        for (int i = 0; i < length; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println(A + B);
        }
    }
}
