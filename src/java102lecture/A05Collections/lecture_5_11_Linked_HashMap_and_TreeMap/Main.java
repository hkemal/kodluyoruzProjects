package java102lecture.A05Collections.lecture_5_11_Linked_HashMap_and_TreeMap;

import java102lecture.A05Collections.lecture_5_4_Tree_Set.Student;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>(new OrderByNoComperator().reversed());
        students.put(100, new Student("Mustafa", 20));
        students.put(101, new Student("Ahmet", 100));
        students.put(102, new Student("Behlül", 45));
        students.put(103, new Student("Damla", 60));
        students.put(104, new Student("Damla", 60));
        students.put(105, new Student("Cemre", 100));

        students.values().forEach(item -> System.out.println(item.getName()));
    }
}
