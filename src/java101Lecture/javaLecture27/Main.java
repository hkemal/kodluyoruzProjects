package java101Lecture.javaLecture27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz : ");
        String userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        String password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?(e/h)");
            String request = input.nextLine();
            if (request.equals("e")) {
                System.out.println("Yeni şifrenizi giriniz : ");
                String newPassword = input.nextLine();
                System.out.println("Tekrar yeni şifrenizi giriniz : ");
                String newPasswordAganin = input.nextLine();
                if (!newPassword.equals(newPasswordAganin)) {
                    System.out.println("Girdiğiniz şifreler uyuşmamaktadır.");
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else if (newPassword.equals(password)) {
                    System.out.println("Yeni şifreniz ile eski şifreniz aynı olamaz.");
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }


//        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
//
//        System.out.print("Seçiminiz : ");
//        int select = input.nextInt();
//
//        switch (select) {
//            case 1:
//                System.out.println("Toplam : " + (number1 + number2));
//                break;
//            case 2:
//                System.out.println("Fark : " + (number1 - number2));
//                break;
//            case 3:
//                System.out.println("Çarpım : " + (number1 * number2));
//                break;
//            case 4: {
//                if (number2 == 0) {
//                    System.out.println("Bir sayı sıfıra bölünemez.");
//                } else {
//                    System.out.println("Bölüm : " + (number1 / number2));
//                }
//                break;
//            }
//            default:
//                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
//        }
    }
}