package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_6_Thread_Pooling;

import java102lecture.A08MultiThreadsAndConcurrency.lecture_8_4_Critical_Section_And_Race_Condition.OrderMatic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic = new OrderMatic();
        List<Thread> transactions = new ArrayList<>();

        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 100; i++) {
            pool.execute(orderMatic);
        }
        pool.shutdown();
        System.out.println(orderMatic.getOrderNo());
    }

}
