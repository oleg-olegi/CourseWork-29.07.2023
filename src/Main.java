import java.util.ArrayList;

public class Main {
    //для вывода списка всех сотрудников
    public static void printEmpl(ArrayList<Employee> obj) {
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
            System.out.println("=======================================");
        }
    }

    //для вывода суммы зарплат всех сотрудников
    public static float sumSalary(ArrayList<Employee> obj) {
        int sum = 0;
        for (Employee a :
                obj) {
            sum = sum + a.getSalary();
        }
        return sum;
    }

    // для вывода сотрудника с минимальной ЗП
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

    // для вывода сотрудника с максиимальной ЗП
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

    //для вывода средней ЗП
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

    //для вывода имен всех сотрудников
    public static void printNameOfEmployees(ArrayList<Employee> obj) {
        for (Employee o : obj
        ) {
            System.out.println("ФИО сотрудника = " + o.getName());
        }
    }

    //для индексирования ЗП
    public static void indexSalaryByPercentage(ArrayList<Employee> employees, int percent) {
        for (Employee o : employees) {
            int currentSalary = o.getSalary();
            int indexSalary = (currentSalary + (currentSalary / 100 * percent));
            o.setSalary(indexSalary);
        }
    }

    //нати сотрудника с мин ЗП по номеру отдела
    public static Employee findMinSalaryByDepartment(ArrayList<Employee> employees, int numberOfDepartment) {
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getDepartment() == numberOfDepartment && employees.get(i).getSalary() < min) {
                min = employees.get(i).getSalary();
                index = i;
            }
        }
        return employees.get(index);
    }

    //нати сотрудника с max ЗП по номеру отдела
    public static Employee findMaxSalaryByDepartment(ArrayList<Employee> employees, int numberOfDepartment) {
        Employee employee = null;
        int max = -1;
        for (Employee o : employees) {
            if (o.getDepartment() == numberOfDepartment && o.getSalary() > max) {
                max = o.getSalary();
                employee = o;
            }
        }
        return employee;
    }

    //сумма затрат на ЗП по отделу
    public static int getTotalSalaryCostByDepartment(ArrayList<Employee> employees, int department) {
        int totalCost = 0;
        for (Employee o :
                employees) {
            if (o.getDepartment() == department) {
                totalCost += o.getSalary();
            }
        }
        return totalCost;
    }

    //средняя ЗП по отделу
    public static int getAverageSalaryCostByDepartment(ArrayList<Employee> employees, int department) {
        int averageCost = 0;
        int count = 0;
        for (Employee o :
                employees) {
            if (o.getDepartment() == department) {
                averageCost += o.getSalary();
                count++;
            }
        }
        return averageCost / count;
    }

    //индексация ЗП сотрудников одного отдела
    public static void indexSalaryCostByDepartment(ArrayList<Employee> employees, int department, int percent) {
        for (Employee o : employees) {
            if (o.getDepartment() == department) {
                int currentSalary = o.getSalary();
                int indexSalary = currentSalary + (currentSalary / 100 * percent);
                o.setSalary(indexSalary);
            }
        }
    }

    //напечатать всех сотрудников отдела - все данные, кроме отдела
    public static void printEmployeesInDepartment(ArrayList<Employee> employees, int department) {
        for (Employee o : employees) {
            if (o.getDepartment() == department) {
                System.out.println(o.getName() + " " + o.getSalary() + " " + o.getId() +
                        "\n=======================================");
            }
        }
    }

    public static void main(String[] args) {

        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 1000);
        Employee tumanov = new Employee("Туманов Алексей Сергеевич", 1, 200);
        Employee petrov = new Employee("Петров Петр Петрович", 2, 1200);
        Employee sidorov = new Employee("Сидоров Сидр Сидорович", 3, 125);
        Employee kuznetsov = new Employee("Кузнецов Илларион Феофилович", 4, 1500);
        Employee kovalev = new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000);
      printEmployeesInDepartment(Employee.getEmployees(), 1);
        /*  System.out.println(findMinSalaryByDepartment(Employee.getEmployees(), 1));
        System.out.println(findMaxSalaryByDepartment(Employee.getEmployees(), 1));
        System.out.println(getTotalSalaryCostByDepartment(Employee.getEmployees(), 1));
        System.out.println(getAverageSalaryCostByDepartment(Employee.getEmployees(), 1));
        indexSalaryCostByDepartment(Employee.getEmployees(), 1, 15);
        System.out.println(getTotalSalaryCostByDepartment(Employee.getEmployees(), 1
        ));
        printEmpl(Employee.getEmployees());
        System.out.println("Сумма затрат на зарплату в месяц - " + sumSalary(Employee.getEmployees()) + '\u20AC' + "\n");
        System.out.println("Наименьшая ЗП у сотрудника - \n" + minSalary(Employee.getEmployees()) + "\n");
        System.out.println("Наибольшая ЗП у сотрудника - \n" + maxSalary(Employee.getEmployees()) + "\n");
        System.out.println("Среднее значение зарплат = " + averageSalary(Employee.getEmployees()) + "\n");
        printNameOfEmployees(Employee.getEmployees());
        indexSalaryByPercentage(Employee.getEmployees(), 10);
        printEmpl(Employee.getEmployees());*/
    }
}
