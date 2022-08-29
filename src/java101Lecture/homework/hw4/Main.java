package java101Lecture.homework.hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        int year = input.nextInt();
        int zodiac = year % 12;
        String zodiacSign = "";

        switch (zodiac) {
            case 0:
                zodiacSign = "Maymun";
                break;
            case 1:
                zodiacSign = "Horoz";
                break;
            case 2:
                zodiacSign = "Köpek";
                break;
            case 3:
                zodiacSign = "Domuz";
                break;
            case 4:
                zodiacSign = "Fare";
                break;
            case 5:
                zodiacSign = "Öküz";
                break;
            case 6:
                zodiacSign = "Kaplan";
                break;
            case 7:
                zodiacSign = "Tavşan";
                break;
            case 8:
                zodiacSign = "Ejderha";
                break;
            case 9:
                zodiacSign = "Yılan";
                break;
            case 10:
                zodiacSign = "At";
                break;
            case 11:
                zodiacSign = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
    }
}