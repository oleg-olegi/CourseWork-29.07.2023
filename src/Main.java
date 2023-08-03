import java.util.ArrayList;

public class Main {



    //для вывода имен всех сотрудников
    public static void printNameOfEmployees(Employee[] arr) {
        for (Employee o : arr) {
            if (o != null) {
                System.out.println("ФИО сотрудника = " + o.getName());
            }
        }
    }

    //для индексирования ЗП
    public static void indexSalaryByPercentage(Employee[] arr, int percent) {
        for (Employee o : arr) {
            if (o != null) {
                int currentSalary = o.getSalary();
                int indexSalary = (currentSalary + (currentSalary / 100 * percent));
                o.setSalary(indexSalary);
            }
        }
    }

    //нати сотрудника с мин ЗП по номеру отдела
    public static Employee findMinSalaryByDepartment(Employee[] arr, int numberOfDepartment) {
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == numberOfDepartment && arr[i].getSalary() < min) {
                    min = arr[i].getSalary();
                    index = i;
                }
            }
        }
        return arr[index];
    }

    //нати сотрудника с max ЗП по номеру отдела
    public static Employee findMaxSalaryByDepartment(Employee[] arr, int numberOfDepartment) {
        Employee employee = null;
        int max = -1;
        for (Employee o : arr) {
            if (o != null) {
                if (o.getDepartment() == numberOfDepartment && o.getSalary() > max) {
                    max = o.getSalary();
                    employee = o;
                }
            }
        }
        return employee;
    }

    //сумма затрат на ЗП по отделу
    public static int getTotalSalaryCostByDepartment(Employee[] arr, int department) {
        int totalCost = 0;
        for (Employee o : arr) {
            if (o != null) {
                if (o.getDepartment() == department) {
                    totalCost += o.getSalary();
                }
            }
        }
        return totalCost;
    }

    //средняя ЗП по отделу
    public static int getAverageSalaryCostByDepartment(Employee[] arr, int department) {
        int averageCost = 0;
        int count = 0;
        for (Employee o : arr) {
            if (o != null) {
                if (o.getDepartment() == department) {
                    averageCost += o.getSalary();
                    count++;
                }
            }
        }
        return averageCost / count;
    }

    //индексация ЗП сотрудников одного отдела
    public static void indexSalaryCostByDepartment(Employee[] arr, int department, int percent) {
        for (Employee o : arr) {
            if (o != null) {
                if (o.getDepartment() == department) {
                    int currentSalary = o.getSalary();
                    int indexSalary = currentSalary + (currentSalary / 100 * percent);
                    o.setSalary(indexSalary);
                }
            }
        }
    }

    //напечатать всех сотрудников отдела - все данные, кроме отдела
    public static void printEmployeesInDepartment(Employee[] employees, int department) {
        for (Employee o : employees) {
            if (o.getDepartment() == department) {
                System.out.println(o.getName() + " " + o.getSalary() + " " + o.getId() + "\n=======================================");
            }
        }
    }

    // Получить в качестве параметра число и найти:
//    1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void employeesWithLessThenSalary(int paramNum, Employee[] employees) {
        for (Employee o : employees) {
            if (o != null) {
                if (o.getSalary() < paramNum) {
                    System.out.println("Сотрудник с ЗП меньше числа - ID " + o.getId() + " " + o.getName() + " " + o.getSalary());
                }
            }
        }
    }

    //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. с зарплатой в консоль).
    public static void employeesMoreThanSalary(int paramNum, Employee[] employees) {
        for (Employee o : employees) {
            if (o != null) {
                if (o.getSalary() >= paramNum) {
                    System.out.println("Сотрудники с ЗП выше, чем число - ID " + o.getId() + " " + o.getName() + " " + o.getSalary());
                }
            }
        }
    }

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 1000));
        employeeBook.addEmployee(new Employee("Туманов Алексей Сергеевич", 1, 200));
        employeeBook.addEmployee(new Employee("Петров Петр Петрович", 2, 1200));
        employeeBook.addEmployee(new Employee("Сидоров Сидр Сидорович", 3, 125));
        employeeBook.addEmployee(new Employee("Кузнецов Илларион Феофилович", 4, 1500));
        employeeBook.addEmployee(new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000));

        employeeBook.printAllEmployees();
        employeeBook.sumSalary();
        employeeBook.minSalaryEmployee();
        employeeBook.maxSalaryEmployee();
        employeeBook.averageSalary();
        /*  indexSalaryByPercentage(employeesList, 20);*/

       /* printEmpl(employeesList);
        System.out.println(sumSalary(employeesList));
        System.out.println("minSalary(employeesList) = " + minSalary(employeesList));
        System.out.println("maxSalary(employeesList) = " + maxSalary(employeesList));
        printNameOfEmployees(employeesList);
        System.out.println(findMinSalaryByDepartment(employeesList, 1));
        employeesWithLessThenSalary(500, employeesList);*/

    }
}
