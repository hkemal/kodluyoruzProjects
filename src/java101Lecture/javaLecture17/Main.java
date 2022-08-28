package java101Lecture.javaLecture17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOrani = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double tutar = input.nextInt();

        double kdvTutar = tutar * kdvOrani;
        double kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOrani);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li tutarı : " + kdvliTutar);
    }
}