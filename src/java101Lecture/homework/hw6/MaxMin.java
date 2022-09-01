package java101Lecture.homework.hw6;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int numberCount = input.nextInt();

        for (int i = 0; i < numberCount; i++) {
            System.out.print(i + 1 + ". sayıyı giriniz : ");
            int number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println();
        }
        System.out.println("En büyük sayı: " + max + "\nEn küçük sayı: : " + min);
    }
}