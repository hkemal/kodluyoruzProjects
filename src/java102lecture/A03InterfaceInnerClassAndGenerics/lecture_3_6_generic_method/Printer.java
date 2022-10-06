package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_6_generic_method;

public class Printer {

    public static <T> void printArray(T[] values) {
        for (T item : values) {
            System.out.println(item);
        }
        System.out.println("*******************");
    }
}
