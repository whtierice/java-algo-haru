package day2;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int q = input.nextInt();
        int l = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int p = input.nextInt();

        if (k != 1) {
            k = 1-k;
        } else {
            k = 0;
        }

        if (q != 1) {
            q = 1-q;
        } else {
            q = 0;
        }

        if (l != 2) {
            l = 2-l;
        } else {
            l = 0;
        }

        if (b != 2) {
            b = 2-b;
        } else {
            b = 0;
        }

        if (n != 2) {
            n = 2-n;
        } else {
            n = 0;
        }

        if (p != 8) {
            p = 8-p;
        } else {
            p = 0;
        }

        System.out.println(k + " " + q + " " + l + " " + b + " " + n + " " + p);

    }
}
