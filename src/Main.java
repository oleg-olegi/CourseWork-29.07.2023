import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 1000);
        Employee petrov = new Employee("Петров Петр Петрович", 2, 1200);
        Employee sidorov = new Employee("Сидоров Сидр Сидорович", 3, 1250);
        Employee kuznetsov  = new Employee("Кузнецов Илларион Феофилович", 4, 1300);
        Employee kovalev  = new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000);
        employees.add(ivanov);
        employees.add(petrov);
        employees.add(sidorov);
        employees.add(kuznetsov);
        employees.add(kovalev);


    }

}
