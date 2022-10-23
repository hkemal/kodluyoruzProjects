package java102lecture.A05Collections.lecture_5_8_Queue_Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mustafa");
        queue.add("Çetindağ");
        queue.offer("Patika");

        //System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println("********");

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
