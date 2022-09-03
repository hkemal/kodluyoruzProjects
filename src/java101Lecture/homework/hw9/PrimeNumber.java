package java101Lecture.homework.hw9;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int num = 2; num < 100; num++) {
            boolean isPrime = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime)
                System.out.print(num + "\t");
        }
    }
}