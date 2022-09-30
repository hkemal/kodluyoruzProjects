package java102lecture.A02OOPBaseRules.lecture_2_2_class_relations;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mustafa", "Çetindağ", "123", "AA", 85);
        Student student2 = new Student("Patika", "Dev", "1123", "BBAA", 100);
        Student student3 = new Student("Kodluyoruz", "Java102", "32123", "CVAA", 50);

        //Kalıtım(Inheritance) => is a
        //Composition, Aggregation
        //Course has a Instructor (Sınıfın bir öğretmeni vardır)
        Instructor instructor = new Instructor("Mahmut", "Çetindağ", "CENG");
        Course mat = new Course("Mat101", "MAT101", instructor);
        Student[] students = {student1, student2, student3};
        double avarage = mat.calculateAvarage(students);
        System.out.println(mat.getInstructor().getName());
        System.out.println("Ortalama : " + avarage);
    }
}
