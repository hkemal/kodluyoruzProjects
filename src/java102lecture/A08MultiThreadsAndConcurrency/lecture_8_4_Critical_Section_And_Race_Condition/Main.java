package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_4_Critical_Section_And_Race_Condition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
        List<Thread> transactions = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(orderMatic);
            transactions.add(thread);
            thread.start();
        }
        for (Thread thread : transactions) {
            thread.join();
        }

        System.out.println(orderMatic.getOrderNo());
    }
}
