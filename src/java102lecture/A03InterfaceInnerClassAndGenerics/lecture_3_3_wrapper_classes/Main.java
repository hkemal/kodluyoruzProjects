package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_3_wrapper_classes;

public class Main {
    public static void main(String[] args) {

        Integer a = 20;
        String str = a.toString();
        String numString = "14";
        Integer num = Integer.parseInt(numString);
        Short s = 2;
        System.out.println(str);
        System.out.println(num + a);

    }
}
