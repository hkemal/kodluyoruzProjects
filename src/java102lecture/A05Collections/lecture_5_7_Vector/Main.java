package java102lecture.A05Collections.lecture_5_7_Vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("Ankara");
        strings.add("Ankara");
        strings.add("İstanbul");
        strings.add("İzmir");

        strings.add(2, "Bolu");
        System.out.println(strings.contains("Ankara"));

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
