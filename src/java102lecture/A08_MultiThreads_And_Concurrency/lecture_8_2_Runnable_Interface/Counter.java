package java102lecture.A08_MultiThreads_And_Concurrency.lecture_8_2_Runnable_Interface;

public class Counter implements Runnable {

    public String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " sayacı başladı.");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name + " : " + i);
        }
    }
}
