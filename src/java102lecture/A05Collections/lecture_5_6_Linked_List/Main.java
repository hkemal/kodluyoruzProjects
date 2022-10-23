package java102lecture.A05Collections.lecture_5_6_Linked_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Mustafa");
        linkedList.add("Çetindağ");
        linkedList.add("Java");
        linkedList.add("102");
        linkedList.add("103");

        linkedList.remove("Mustafa");
        linkedList.remove(3);
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();
        for (int i = 1; i < 10000000; i++) {
            myArrayList.add(i);
            myLinkedList.add(i);
        }

        long startTimeArrayList = System.nanoTime();
        myArrayList.add(100, 234);
        long endTimeArrayList = System.nanoTime();
        System.out.println("ArrayList'e eleman ekleme süresi : " + (endTimeArrayList - startTimeArrayList));

        long startTimeLinkedList = System.nanoTime();
        myLinkedList.add(100, 234);
        long endTimeLinkedList = System.nanoTime();
        System.out.println("LinkedList'e eleman ekleme süresi : " + (endTimeLinkedList - startTimeLinkedList));
    }
}
