package java102lecture.A04Exceptions.lecture_4_1_exception_handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Başladı.");
        Scanner input = new Scanner(System.in);
        System.out.println("A sayısını giriniz : ");
        int a = input.nextInt();
        int b = 10;
        if (a == 0) {
            System.out.println("Bir sayı sıfıra bölünemez!");
        } else {
            System.out.println(b / a);
        }
        System.out.println("Program bitti!");
    }
}
