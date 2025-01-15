package day2;

import java.util.Scanner;

public class BOJ10871 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int num = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        boolean first = true; // 첫 번째 출력인지 확인하는 변수

        for (int i = 0; i < size; i++) {
            if (array[i] < num) {
                if (!first) {
                    System.out.print(" "); // 첫 번째 출력 이후에만 공백 추가
                }
                System.out.print(array[i]);
                first = false;
            }
        }
    }
}
