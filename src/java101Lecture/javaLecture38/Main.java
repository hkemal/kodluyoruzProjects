package java101Lecture.javaLecture38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (i % 12 == 0) {
                counter++;
                total += i;
            }
        }
        if (counter == 0) {
            System.out.println("3'e ve 4'e tam bölünen sayı bulunmamaktadır. ");
        } else {
            System.out.println("3'e ve 4'e tam bölünenlerin ortalaması: " + total / counter);
        }
    }
}