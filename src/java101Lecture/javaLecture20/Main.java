package java101Lecture.javaLecture20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yarı çap giriniz : ");
        double yariçap = input.nextDouble();

        double çevre = 2 * yariçap * Math.PI;
        double alan = yariçap * Math.PI * Math.PI;

        System.out.println("Dairenin çevresi : " + çevre);
        System.out.println("Dairenin alanı : " + alan);
    }
}