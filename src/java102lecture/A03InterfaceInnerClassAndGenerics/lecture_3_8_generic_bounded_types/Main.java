package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_8_generic_bounded_types;

public class Main {
    public static void main(String[] args) {

//        Integer,Double,Float extends Number
        Nullable<Integer> nullable = new Nullable<>(1);
        nullable.run();

//        Hata verir
//        Nullable<String> stringNullable = new Nullable<String>("abc");
    }
}
