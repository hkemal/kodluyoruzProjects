package java101Lecture.javaLecture19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmUcret = 2.2;
        double minimumUcret = 20;
        double acilisUcreti = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe giriniz : ");
        double mesafe = input.nextDouble();

        double toplamUcret = acilisUcreti + kmUcret * mesafe;

        System.out.println("Ödemeniz gereken miktar : " + (toplamUcret > minimumUcret ? toplamUcret : minimumUcret));
    }
}