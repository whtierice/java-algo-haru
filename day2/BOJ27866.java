package day2;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int n = input.nextInt();

        System.out.println(s.charAt(n-1));
    }
}
