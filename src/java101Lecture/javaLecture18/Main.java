package java101Lecture.javaLecture18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A kenarını giriniz : ");
        double aKenari = input.nextInt();

        System.out.print("B kenarını giriniz : ");
        double bKenari = input.nextInt();

        double hipotenus = Math.sqrt(aKenari * aKenari + bKenari * bKenari);

        System.out.println("A kenarı : " + aKenari);
        System.out.println("B kenarı : " + bKenari);
        System.out.println("Hipotenüs : " + hipotenus);
    }
}