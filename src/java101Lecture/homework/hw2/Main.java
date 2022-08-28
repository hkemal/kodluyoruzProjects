package java101Lecture.homework.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        double patlıcanKilo = input.nextDouble();

        double toplam = armut * armutKilo + elma * elmaKilo + patlıcan * patlıcanKilo + muz * muzKilo + domates * domatesKilo;
        System.out.println("Toplam Tutar :" + toplam);
    }
}