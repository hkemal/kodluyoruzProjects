package java101Lecture.javaLecture62;

public class Student {

    String name;

    String studentNumber;

    int classes;

    Course mat;

    Course fizik;

    Course kimya;

    double avarage;

    boolean isPass;

    Student(String name, int classes, String studentNumber, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.studentNumber = studentNumber;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int matPerformanceNote, int fizikPerformanceNote, int kimyaPerformanceNote, double matPercentage, double fizikPercentage, double kimyaPercentage) {
        if (mat >= 0 && mat <= 100 && matPerformanceNote >= 0 && matPerformanceNote <= 100) {
            this.mat.note = (int) (mat * (1 - matPercentage) + matPerformanceNote * matPercentage);
        }
        if (fizik >= 0 && fizik <= 100 && fizikPerformanceNote >= 0 && fizikPerformanceNote <= 100) {
            this.fizik.note = (int) (fizik * (1 - fizikPercentage) + fizikPerformanceNote * fizikPercentage);
        }
        if (kimya >= 0 && kimya <= 100 && kimyaPerformanceNote >= 0 && kimyaPerformanceNote <= 100) {
            this.kimya.note = (int) (kimya * (1 - kimyaPercentage) + kimyaPerformanceNote * kimyaPercentage);
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
