package java101Lecture.javaLecture39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bir sayı giriniz : ");
            number = input.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 != 1);
        System.out.println("Dörde tam bölünenlerin toplamı : " + total);
    }
}