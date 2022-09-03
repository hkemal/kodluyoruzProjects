package java101Lecture.javaLecture53;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println(isPolindrom(number) ? "Polindrom" : "Polindrom değil");
    }

    public static boolean isPolindrom(Integer number) {
        char firstChar = 0;
        char lastChar = 0;
        boolean isPolindrom = true;
        while (number != 0) {
            if (number / 10 == 0) break;
            String numberString = String.valueOf(number);
            firstChar = numberString.charAt(0);
            lastChar = numberString.charAt(numberString.length() - 1);
            String newNumberString = numberString.substring(1, numberString.length() - 1);
            if (firstChar != lastChar) {
                isPolindrom = false;
                break;
            }
            if (newNumberString.equals("")) break;
            number = Integer.parseInt(newNumberString);
        }
        return isPolindrom;
    }
}