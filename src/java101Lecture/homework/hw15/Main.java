package java101Lecture.homework.hw15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < length; i++) {
            System.out.print(i + 1 + ". Elemanı : ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
