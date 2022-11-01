package java102lecture.A09OtherSubject.lecture_9_3_stream_api;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);
        list.forEach(System.out::println);
        System.out.println("*******************");
        list.stream().filter(item -> item < 10).forEach(System.out::println);
        System.out.println("*******************");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("*******************");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("*******************");
        list.stream().limit(5).forEach(System.out::println);
        System.out.println("*******************");
        list.stream().skip(3).limit(5).forEach(System.out::println);
        System.out.println("*******************");
        System.out.println(list.stream().skip(3).limit(5).count());
        System.out.println("*******************");
        System.out.println(list.stream().anyMatch(i -> i == 25));
        System.out.println(list.stream().allMatch(i -> i > 1));
        System.out.println(list.stream().noneMatch(i -> i < 1));
        System.out.println("*******************");
        list.stream().map(item -> item * 2).forEach(System.out::println);
    }
}
