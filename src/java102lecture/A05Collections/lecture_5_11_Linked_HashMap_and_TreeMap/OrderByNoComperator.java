package java102lecture.A05Collections.lecture_5_11_Linked_HashMap_and_TreeMap;

import java.util.Comparator;

public class OrderByNoComperator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
