package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_4_autoboxing_and_unboxing;

public class Main {
    public static void main(String[] args) {

        //Boxing
        //Unboxing

        int a = 10;

        //Autoboxing
        Integer b = a;

        //Boxing
        Integer c = Integer.valueOf(a);
        Integer d = Integer.valueOf("19");

        //AutoUnboxing
        int e = c;

        //UnautoUnboxing
        int f = c.intValue();
        int g = d.intValue();
    }
}
