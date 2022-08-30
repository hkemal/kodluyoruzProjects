package java101Lecture.javaLecture41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon için : ");
        System.out.println("n değerini giriniz : ");
        int n = input.nextInt();
        System.out.println("r değerini giriniz : ");
        int r = input.nextInt();
        int numerator = 1;
        int rfaktorial = 1;
        int nMinusRFactorial = 1;

        for (int i = 1; i <= n; i++) {
            numerator *= i;
        }

        for (int i = 1; i <= r; i++) {
            rfaktorial *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            nMinusRFactorial *= i;
        }

        int result = numerator / (rfaktorial * nMinusRFactorial);

        System.out.println("Kombinasyon : " + result);
    }
}