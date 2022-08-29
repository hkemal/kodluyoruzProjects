package java101Lecture.javaLecture29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz : ");
        int heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            if (heat == 5) {
                System.out.println("Kayak yapabilirsiniz.");
            }
        } else if (heat >= 15 && heat < 25) {
            System.out.println("Piknik yapabilirsiniz.");
            if (heat == 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        } else if (heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
            if (heat == 25) {
                System.out.println("Piknik yapabilirsiniz.");
            }
        }
    }
}