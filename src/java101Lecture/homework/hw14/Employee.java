package java101Lecture.homework.hw14;

public class Employee {

    String name;

    double salary;

    int workHours;

    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000.0) {
            return 0.0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30.0;
        }
        return 0.0;
    }

    double raiseSalary() {
        int workYear = 2021 - this.hireYear;
        if (workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
