package java101Lecture.javaLecture70;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir değer giriniz : ");
        int number = input.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int[] newList = {15, 12, 788, 1, -1, -778, 2, 0, number};
        Arrays.sort(newList);
        int numberIndex = Arrays.binarySearch(newList, number);
        if (numberIndex != 0) {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + newList[numberIndex - 1]);
        }
        if (numberIndex != newList.length - 1) {
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + newList[numberIndex + 1]);
        }
    }
}
