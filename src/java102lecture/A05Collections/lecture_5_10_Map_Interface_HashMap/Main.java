package java102lecture.A05Collections.lecture_5_10_Map_Interface_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("TR", "Türkiye");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");
//        country.remove("TR");

        System.out.println(country.get("TR"));
        System.out.println(country.size());
        country.values().forEach(System.out::println);
        System.out.println("***************");
        country.keySet().forEach(System.out::println);
    }
}
