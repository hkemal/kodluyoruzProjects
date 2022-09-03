package java101Lecture.homework.hw8;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        for (int i = number - 1; i >= 1; i--) {
            for (int j = i; j <= number - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}