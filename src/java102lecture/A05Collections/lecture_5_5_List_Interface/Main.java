package java102lecture.A05Collections.lecture_5_5_List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(null);
        myList.add(-10);
        myList.add(20);
        myList.add(5);
        myList.add(1);
        System.out.println(myList);
        System.out.println("*************");
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*************");
        for (Integer item : myList) {
            System.out.println(item);
        }
        System.out.println("*************");
        System.out.println(myList.get(1));
        System.out.println(myList.size());
        System.out.println(myList.indexOf(1));
        System.out.println(myList.get(myList.indexOf(1)));
        System.out.println(myList.lastIndexOf(1));
        System.out.println(myList.lastIndexOf(91));
        System.out.println("*************");
        myList.add(1, 19);
        System.out.println(myList);
        myList.set(2, 76);
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        System.out.println("*************");
        List<Integer> template = new ArrayList<>();
        template.add(9);
        template.add(8);
        template.add(7);
        template.add(6);
        System.out.println(template);
//        template.addAll(myList);
        template.addAll(2, myList);
        System.out.println(template);
        System.out.println("*************");
        System.out.println(myList.subList(2, 4));
        Object[] objects = myList.toArray();
        Integer[] integers = myList.toArray(new Integer[0]);
        System.out.println(integers[0]);
        myList.clear();
        System.out.println(myList);
    }
}
