package java101Lecture.javaLecture43;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        int digitCount = 0;
        int total = 0;
        int transactionNumber = number;

        while (transactionNumber > 0) {
            digitCount++;
            transactionNumber /= 10;
        }

        transactionNumber = number;
        while (transactionNumber > 0) {
            int digit = transactionNumber % 10;
            int power = 1;
            for (int i = 1; i <= digitCount; i++) {
                power *= digit;
            }
            total += power;
            transactionNumber /= 10;
        }
        if (total == number) {
            System.out.println(number + " bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayı değildir.");
        }
        //////////////////

    }
}