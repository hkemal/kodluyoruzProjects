package java101Lecture.javaLecture43;

public class Practice2 {
    public static void main(String[] args) {

        for (int number = 100; number < 1000; number++) {
            int digitCount = 0;
            int total = 0;
            int transactionNumber = number;

            while (transactionNumber > 0) {
                digitCount++;
                transactionNumber /= 10;
            }

            transactionNumber = number;
            while (transactionNumber > 0) {
                int digit = transactionNumber % 10;
                int power = 1;
                for (int i = 1; i <= digitCount; i++) {
                    power *= digit;
                }
                total += power;
                transactionNumber /= 10;
            }
            if (total == number) {
                System.out.println(number + " bir Armstrong sayıdır.");
            }
        }
    }
}