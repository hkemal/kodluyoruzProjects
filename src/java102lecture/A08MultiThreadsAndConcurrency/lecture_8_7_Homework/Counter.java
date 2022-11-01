package java102lecture.A08MultiThreadsAndConcurrency.lecture_8_7_Homework;

import java.util.ArrayList;
import java.util.List;

public class Counter implements Runnable {

    private static ArrayList<Integer> evenNumbers = new ArrayList<>();

    private static ArrayList<Integer> oddNumbers = new ArrayList<>();

    private List<Integer> myList = new ArrayList<>();

    public Counter(List<Integer> myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is working.");
            findNumbers(this.myList);
            System.out.println(evenNumbers);
            System.out.println(oddNumbers);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void findNumbers(List<Integer> list) {
        for (Integer i : list) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }
    }

    public static ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public static void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        Counter.evenNumbers = evenNumbers;
    }

    public static ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public static void setOddNumbers(ArrayList<Integer> oddNumbers) {
        Counter.oddNumbers = oddNumbers;
    }
}
