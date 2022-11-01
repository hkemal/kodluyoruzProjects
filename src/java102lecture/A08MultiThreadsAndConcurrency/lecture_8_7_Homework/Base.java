package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_7_Homework;

import java.util.ArrayList;
import java.util.List;

public class Base {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        List<Integer> subList1 = list.subList(0, 2500);
        List<Integer> subList2 = list.subList(2500, 5000);
        List<Integer> subList3 = list.subList(5000, 7500);
        List<Integer> subList4 = list.subList(7500, 10000);

        Counter c1 = new Counter(subList1);
        Counter c2 = new Counter(subList2);
        Counter c3 = new Counter(subList3);
        Counter c4 = new Counter(subList4);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
