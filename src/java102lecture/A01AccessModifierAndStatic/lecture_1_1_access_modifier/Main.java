package java102lecture.A01AccessModifierAndStatic.lecture_1_1_access_modifier;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass();
        System.out.println(superClass.namePublic);
        System.out.println(superClass.nameProtected);
        System.out.println(superClass.getNamePrivate());

        SubClass subClass = new SubClass();
        System.out.println(subClass.namePublic);
        System.out.println(subClass.nameProtected);
        System.out.println(subClass.getNamePrivate());
    }
}
