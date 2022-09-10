package java101Lecture.finalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz : ");
        int row = input.nextInt();
        System.out.println("Sütun sayısı giriniz : ");
        int column = input.nextInt();
        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}
