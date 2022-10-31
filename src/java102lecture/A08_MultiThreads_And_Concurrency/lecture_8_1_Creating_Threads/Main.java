package java102lecture.A08_MultiThreads_And_Concurrency.lecture_8_1_Creating_Threads;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter-1");
        Counter counter2 = new Counter("Counter-2");
        counter1.start();
        counter2.start();
    }
}
