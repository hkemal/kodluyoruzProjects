package java102lecture.A09OtherSubject.lecture_9_1_type_casting;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = a;

        double pi = 3.14;
        int c = (int) pi;
        System.out.println(c);

        String aString = String.valueOf(a);
        Integer aInteger = Integer.parseInt(aString);
    }
}
