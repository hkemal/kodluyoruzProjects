package java101Lecture.homework.hw10;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int total = 0;

        if (number == 1) {
            System.out.println("0");
        } else if (number <= 0) {
            System.out.println("Yanlış bir numara seçtiniz.");
        } else {
            System.out.print(num1 + "\t" + num2 + "\t");
            for (int i = 0; i < number - 2; i++) {
                total = num1 + num2;
                System.out.print(total + "\t");
                num1 = num2;
                num2 = total;
            }
        }
        System.out.println();
    }
}