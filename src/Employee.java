import java.util.ArrayList;
import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int count = 1;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }
    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    @Override
    public String toString() {

        return "Имя сотрудника - " + name + "\nОтдел - " + department + "\nЗарплата - " + salary + '\u20AC' + "\nID cотрудника - " + id;
    }
}
