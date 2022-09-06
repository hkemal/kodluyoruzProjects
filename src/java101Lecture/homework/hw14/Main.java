package java101Lecture.homework.hw14;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal", 2000.0, 45, 1985);
        double tax = employee.tax();
        double bonus = employee.bonus();
        double raise = employee.raiseSalary();
        double salaryWithBonus = employee.salary - tax + bonus + raise;
        System.out.println("Toplam maaş : " + salaryWithBonus);
    }
}
