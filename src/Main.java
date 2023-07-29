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

    public static Employee minSalary(ArrayList<Employee> obj) {
        int index = 0;
        int min = obj.get(0).getSalary();
        for (int i = 0; i < obj.size(); i++) {
            if (min > obj.get(i).getSalary()) {
                min = obj.get(i).getSalary();
                index = i;
            }
        }

        return obj.get(index);
    }

    public static Employee maxSalary(ArrayList<Employee> obj) {
        int ind = 0;
        int max = obj.get(0).getSalary();
        for (int i = 0; i < obj.size(); i++) {
            if (max < obj.get(i).getSalary()) {
                max = obj.get(i).getSalary();
                ind = i;
            }
        }
        return obj.get(ind);
    }

    public static int averageSalary(ArrayList<Employee> obj) {
        int sum = 0;
        int count = 0;
        for (Employee a :
                obj) {
            sum = sum + a.getSalary();
            count++;
        }
        return sum / count;
    }

    public static void printName(ArrayList<Employee> obj) {
        for (Employee o : obj
        ) {
            System.out.println("ФИО сотрудника = " + o.getName());
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 1900);
        Employee petrov = new Employee("Петров Петр Петрович", 2, 1200);
        Employee sidorov = new Employee("Сидоров Сидр Сидорович", 3, 125);
        Employee kuznetsov = new Employee("Кузнецов Илларион Феофилович", 4, 1500);
        Employee kovalev = new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000);

        employees.add(ivanov);
        employees.add(petrov);
        employees.add(sidorov);
        employees.add(kuznetsov);
        employees.add(kovalev);

        printEmpl(employees);
        System.out.println("Сумма затрат на зарплату в месяц - " + sumSalary(employees) + '\u20AC' + "\n");
        System.out.println("Наименьшая ЗП у сотрудника - \n" + minSalary(employees) + "\n");
        System.out.println("Наибольшая ЗП у сотрудника - \n" + maxSalary(employees) + "\n");
        System.out.println("Среднее значение зарплат = " + averageSalary(employees) + "\n");
        printName(employees);
    }
}
