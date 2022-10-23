package java102lecture.A05Collections.lecture_5_9_Priority_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());

        priorityQueue.add("Mustafa");
        priorityQueue.add("Çetindağ");
        priorityQueue.add("Ahmet");
        priorityQueue.add("Damla");

        System.out.println(priorityQueue.element());

        priorityQueue.stream().forEach(System.out::println);

    }
}
