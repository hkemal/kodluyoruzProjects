package java101Lecture.javaLecture47;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        int ebob = 1;
        int ekok = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);

        int j = n1 * n2;
        while (j >= n2) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
            }
            j--;
        }
        System.out.println("Ekok : " + ekok);
    }
}