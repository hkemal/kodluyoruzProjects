package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_1_interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart No giriniz : ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarihi giriniz : ");
        String expireDate = input.next();

        System.out.print("Güvenlik Kodu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka Seçiniz : ");

        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankası", "a123456", "123123");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, expireDate, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası", "b123456", "123123");
                bPos.connect("127.2.2.2");
                bPos.payment(price, cardNumber, expireDate, cvc);
                break;
            case 3:
                CBankasi cPos = new CBankasi("C Bankası", "c123456", "123123");
                cPos.connect("127.3.3.3");
                cPos.payment(price, cardNumber, expireDate, cvc);
                break;
            default:
                System.out.println("Geçerli bir banka giriniz!");
        }

    }
}
