package java102lecture.A05Collections.lecture_5_4_Tree_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(40);
        myTreeSet.add(20);
        myTreeSet.add(10);
        myTreeSet.add(30);

        System.out.println(myTreeSet.size());
        System.out.println("**************");
//        myTreeSet.remove(10);
//        myTreeSet.clear();
//        for (Integer item : myTreeSet) {
//            System.out.println(item);
//        }
        Iterator<Integer> iterator = myTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**************");
        System.out.println(myTreeSet.contains(10));
        System.out.println(myTreeSet.contains(1));
        System.out.println("**************");

        TreeSet<Student> students = new TreeSet<>(new OrderNameComparable().reversed());
        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 100));
        students.forEach(item -> System.out.println(item.getName()));
    }
}
