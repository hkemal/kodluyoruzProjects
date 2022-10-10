package java102lecture.A04Exceptions.lecture_4_3_throw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age = input.nextInt();
        try {
            Main.checkAge(age);
        } catch (Exception exception) {
            System.out.println("Yaşı uymadı");
            System.out.println(exception.getMessage());
        }
        System.out.println("Program bitti!");
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Yaşınız tutmuyor!");
        }
        System.out.println("Yaşınız uygundur.");
    }
}
