package java101Lecture.javaLecture28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner input = new Scanner(System.in);
        int courseCount = 0;
        int total = 0;

        System.out.print("Matamatik notunuz : ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            courseCount++;
            total += mat;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            courseCount++;
            total += turkce;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            courseCount++;
            total += fizik;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            courseCount++;
            total += kimya;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            courseCount++;
            total += muzik;
        }

        if (courseCount == 0) {
            System.out.println("Ders puanları doğru girilmedi");
        } else {
            double average = total / courseCount;
            if (average >= 55) {
                System.out.println("Tebrikler sınıfı geçtiniz.");
            } else {
                System.out.println("Sınıfı geçemediniz.");
            }
            System.out.println("Ortalamanız : " + average);
        }
    }
}