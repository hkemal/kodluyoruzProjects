package java101Lecture.javaLecture26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        double number1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz : ");
        double number2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Seçiminiz : ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Fark : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpım : " + (number1 * number2));
                break;
            case 4: {
                if (number2 == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                } else {
                    System.out.println("Bölüm : " + (number1 / number2));
                }
                break;
            }
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
        }
    }
}