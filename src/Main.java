import java.util.ArrayList;

public class Main {

    public static void printEmpl(ArrayList<Employee> obj) {
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
            System.out.println("=======================================");
        }
    }

    public static float sumSalary(ArrayList<Employee> obj) {
        int sum = 0;
        for (Employee a :
                obj) {
            sum = sum + a.getSalary();
        }
        return sum;
    }

    public static int minSalary(ArrayList<Employee> obj) {
        int min = obj.get(0).getSalary();
        for (int i = 0; i < obj.size(); i++) {
            if (min > obj.get(i).getSalary()) {
                min = obj.get(i).getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(ArrayList<Employee> obj) {
        int max = obj.get(0).getSalary();
        for (int i = 0; i < obj.size(); i++) {
            if (max < obj.get(i).getSalary()) {
                max = obj.get(i).getSalary();
            }
        }
        return max;
    }


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 1000);
        Employee petrov = new Employee("Петров Петр Петрович", 2, 1200);
        Employee sidorov = new Employee("Сидоров Сидр Сидорович", 3, 1250);
        Employee kuznetsov = new Employee("Кузнецов Илларион Феофилович", 4, 1300);
        Employee kovalev = new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000);

        employees.add(ivanov);
        employees.add(petrov);
        employees.add(sidorov);
        employees.add(kuznetsov);
        employees.add(kovalev);

        printEmpl(employees);
        System.out.println("Сумма затрат на зарплату в месяц - " + sumSalary(employees) + '\u20AC');
        System.out.println(minSalary(employees));
        System.out.println("maxSalary(employees) = " + maxSalary(employees));
    }
}
