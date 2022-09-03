package java101Lecture.homework.hw13;

import java.util.Scanner;

public class DeseneGoreMetot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Geçersiz bir değer girdiniz.");
        } else {
            int decreasedNumber = decrease(number);
            increase(decreasedNumber, number);
        }
    }

    static int decrease(int number) {
        if (number <= 0) return number;
        else {
            System.out.print(number + "  ");
            return decrease(number - 5);
        }
    }

    static int increase(int number, int number1) {
        if (number > number1) return number;
        else {
            System.out.print(number + "  ");
            return increase(number + 5, number1);
        }
    }
}