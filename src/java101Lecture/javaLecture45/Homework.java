package java101Lecture.javaLecture45;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int number = input.nextInt();
        number /= 2;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = number - 1; j >= (2 * i - 4); j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}