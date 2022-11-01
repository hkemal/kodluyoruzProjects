package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_1_Creating_Threads;

public class Counter extends Thread {

    public String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.name + " : " + i);
        }
    }
}
