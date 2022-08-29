package java101Lecture.homework.hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int type = input.nextInt();

        if (distance < 0 || !(type == 1 || type == 2)) {
            System.out.println("Hatalı veri girdiniz!");
        } else {
            double price = 0.1 * distance;
            if (age < 12) {
                price *= 0.5;
            } else if (age >= 12 && age < 24) {
                price *= 0.9;
            }else if (age >= 65) {
                price *= 0.7;
            }
            if (type == 2) {
                price *= 1.6;
            }
            System.out.println(price);
        }
    }
}