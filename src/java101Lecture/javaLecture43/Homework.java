package java101Lecture.javaLecture43;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        int total = 0;

        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        System.out.println("Basamak toplami: " + total);
    }
}