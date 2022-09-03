package java101Lecture.homework.hw11;

import java.util.Scanner;

public class PowerRecursive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        System.out.print("Üs giriniz : ");
        int power = input.nextInt();
        int result = power(number, power);
        System.out.println("Sonuç : " + result);
    }

    static int power(int number, int power) {
        if (power != 0) {
            return (number * power(number, power - 1));
        } else {
            return 1;
        }
    }
}