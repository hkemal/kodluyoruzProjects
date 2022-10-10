package java102lecture.A04Exceptions.lecture_4_2_try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Başladı.");
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 10;
        int c;
        int[] arr = new int[2];
        try {
            System.out.println("Bölme işlemi");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti!");
            c = input.nextInt();
            arr[10] = 3;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Hata yakalandı.");
            arithmeticException.printStackTrace();
            System.out.println(arithmeticException.toString());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Yanlış veri girildi!");
            inputMismatchException.printStackTrace();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Bu kısım kesinlikle çalışacak!");
        }
        System.out.println("Program bitti!");
    }
}
