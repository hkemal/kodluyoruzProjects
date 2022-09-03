package java101Lecture.homework.hw7;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        System.out.println(total == number ? number + " bir mükemmel sayıdır." : number + " bir mükemmel sayı değildir.");
    }
}