package day1;

import java.util.Scanner;

public class BOJ10430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        System.out.println((A+B) % C);
        System.out.println(((A%C) + (B%C)) % C);
        System.out.println((A*B) % C);
        System.out.println( ((A%C) * (B%C)) % C );
    }
}
