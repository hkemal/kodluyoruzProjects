package java102lecture.A09OtherSubject.lecture_9_2_lamda_expression;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable sınıfı");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> System.out.println("r2 sınıfı");
        runnable2.run();
        System.out.println("********************");
        Math sum = new Math() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sum.transaction(1, 2));

        Math sum2 = (num1, num2) -> num1 + num2;
        System.out.println(sum2.transaction(3, 4));
    }
}
