package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_5_generic;

public class Main {
    public static void main(String[] args) {

//        //undefined
//        String s;
//
//        //null
//        String s1 = null;
//
//        //empty
//        String s2 = null;

        String str = "12313";
        Nullable<String> nullable = new Nullable<>(str);
        Nullable<Integer> nullableInt = new Nullable<>(45);
        nullable.run();
        nullableInt.run();
        System.out.println("***************");
        Integer a = 2;
        String b = "str";
        Double c = 3.14;
        Test<Integer, String, Double> test = new Test<>(a, b, c);
        test.showInfo();
    }
}
