package java101Lecture.javaLecture40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println("4'ün kuvvetleri : ");
        for (int i = 1; i < number; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("5'in kuvvetleri : ");
        for (int i = 1; i < number; i *= 5) {
            System.out.print(i + " ");
        }
    }
}