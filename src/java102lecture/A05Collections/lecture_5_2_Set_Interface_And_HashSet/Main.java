package java102lecture.A05Collections.lecture_5_2_Set_Interface_And_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(10);
        myHashSet.add(20);
        myHashSet.add(10);
        myHashSet.add(30);
        myHashSet.add(null);

        System.out.println(myHashSet.size());
        System.out.println("**************");
//        myHashSet.remove(10);
//        myHashSet.clear();
//        for (Integer item : myHashSet) {
//            System.out.println(item);
//        }
        Iterator<Integer> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**************");
        System.out.println(myHashSet.contains(10));
        System.out.println(myHashSet.contains(1));
    }
}
