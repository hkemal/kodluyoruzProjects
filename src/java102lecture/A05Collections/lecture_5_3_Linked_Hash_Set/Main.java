package java102lecture.A05Collections.lecture_5_3_Linked_Hash_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(40);
        myLinkedHashSet.add(20);
        myLinkedHashSet.add(10);
        myLinkedHashSet.add(30);
        myLinkedHashSet.add(null);

        System.out.println(myLinkedHashSet.size());
        System.out.println("**************");
//        myLinkedHashSet.remove(10);
//        myLinkedHashSet.clear();
//        for (Integer item : myLinkedHashSet) {
//            System.out.println(item);
//        }
        Iterator<Integer> iterator = myLinkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**************");
        System.out.println(myLinkedHashSet.contains(10));
        System.out.println(myLinkedHashSet.contains(1));
    }
}
