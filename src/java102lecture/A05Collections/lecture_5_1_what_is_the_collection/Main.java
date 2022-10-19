package java102lecture.A05Collections.lecture_5_1_what_is_the_collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Set<E>
        HashSet<Integer> myHashSet = new HashSet<>();

        LinkedHashSet<Integer> myLinkedHashSet = new LinkedHashSet<>();

        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(2);
        myTreeSet.add(1);
        myTreeSet.add(4);
        myTreeSet.add(3);
        myTreeSet.stream().forEach(System.out::println);

        //List<E>
        ArrayList<Integer> myArrayList = new ArrayList<>();

        Vector<Integer> myVector = new Vector<>();

        //Queue<E> List<E>
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        //Queue<E>
        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();

        //Map<K,V>
        LinkedHashMap<Integer, String> myLinkedHashMap = new LinkedHashMap<>();

        TreeMap<Integer, String> myTreeMap = new TreeMap<>();
    }
}
