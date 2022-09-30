package java102lecture.A02OOPBaseRules.lecture_2_1_encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("", 150);
        Book lordOfTheRings = new Book("", -100);
        lordOfTheRings.setName("Abc");
        lordOfTheRings.setPageNumber(1999);
        System.out.println(lordOfTheRings.getName());
        System.out.println(lordOfTheRings.getPageNumber());
    }
}
