package java101Lecture.javaLecture42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alıncak sayıyı giriniz : ");
        int n = input.nextInt();
        System.out.println("Üst olacak sayıyı giriniz : ");
        int k = input.nextInt();

        int result = n;
        for (int i = 1; i < k; i++) {
            result *= n;
        }
        System.out.println(result);
    }
}