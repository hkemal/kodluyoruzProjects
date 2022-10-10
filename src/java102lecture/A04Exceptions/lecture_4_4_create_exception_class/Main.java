package java102lecture.A04Exceptions.lecture_4_4_create_exception_class;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Yaş hatası alındı!");
        }
        System.out.println("Yaşınız uygundur.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int age = input.nextInt();
        try {
            Main.checkAge(age);
        } catch (AgeCheckException e) {
            System.out.println(e);
        }
    }
}
