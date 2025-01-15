package day3;

import java.util.Scanner;

public class BOJ2530 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();

        int min = input.nextInt();

        int sec = input.nextInt();


        int need = input.nextInt();


        min = min + ((need + sec) / 60);
        sec = (sec + need) % 60;

        hour += min / 60;
        min = min % 60;

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + min + " " + sec);


    }
}
