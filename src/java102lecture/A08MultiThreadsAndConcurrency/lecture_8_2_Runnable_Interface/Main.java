package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_2_Runnable_Interface;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter("counter-1");
        Counter c2 = new Counter("counter-2");
        Counter c3 = new Counter("counter-3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}
