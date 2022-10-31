package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_3_Thread_Sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter("Counter-1", 1);
        Thread thread1 = new Thread(c1);
        thread1.start();
        Thread.sleep(2000);
        c1.stop();

        Counter c2 = new Counter("Counter-2", 2);
        Thread thread2 = new Thread(c2);
        thread2.start();
        c2.stop();
    }
}
