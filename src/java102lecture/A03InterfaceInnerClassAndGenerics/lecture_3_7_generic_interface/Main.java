package java102lecture.A03InterfaceInnerClassAndGenerics.lecture_3_7_generic_interface;

public class Main {
    public static void main(String[] args) {
        Student<String> student = new Student<>();
        student.insert("Abc");

        Student<Integer> studentInt = new Student<>();
        studentInt.insert(123);
    }
}
