package java101Lecture.homework.hw12;

import java.util.Scanner;

public class PrimeNumberRecursive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        if (isPrime(number, 2)) System.out.println(number + " sayısı ASAL'dır !");
        else System.out.println(number + " sayısı ASAL değildir !");
    }

    static boolean isPrime(int number, int i) {
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % i == 0)
            return false;
        if (i * i > number)
            return true;
        return isPrime(number, i + 1);
    }
}