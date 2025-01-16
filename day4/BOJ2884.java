package day4;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt();

        if (min >= 45) {
            min -= 45;
        } else {
            min += 15;
            if (hour == 0) {
              hour = 23;
            }else {
                hour--;
            }
        }

        System.out.println(hour + " " + min);


    }
}
