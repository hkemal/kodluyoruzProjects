package java101Lecture.javaLecture54;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println("Fibonacci : " + fibonacci(number));
    }

    static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}