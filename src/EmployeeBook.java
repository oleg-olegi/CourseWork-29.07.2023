public class EmployeeBook {
    private Employee[] employees;
    private int employeeCount;
    private final int idDepartment = 5;

    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
        employeeCount = 0;
    }
/*
    //добавляем нового сотрдника в массив
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        }
    }*/

    //для вывода списка всех сотрудников
    public void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
                System.out.println("=======================================");
            }
        }
    }

    //для вывода суммы зарплат всех сотрудников
    public void sumSalary() {
        int sum = 0;
        for (Employee a : employees) {
            if (a != null) {
                sum = sum + a.getSalary();
            }
        }
        System.out.println("Сумма зарплат всех сотрудников - " + sum + "\u20AC");
    }

    // для вывода сотрудника с минимальной ЗП
    public void minSalaryEmployee() {
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с МИН ЗП - " + employees[index] + "\n======================================");
    }

    // для вывода сотрудника с максиимальной ЗП
    public void maxSalaryEmployee() {
        int ind = 0;
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                ind = i;
            }
        }
        System.out.println("Сотрудник с MAX ЗП - " + employees[ind] + "\n======================================");
    }

    //для вывода средней ЗП
    public void averageSalary() {
        double sum = 0;
        int count = 0;
        double averageSum = 0;
        for (Employee a : employees) {
            if (a != null) {
                sum = sum + a.getSalary();
                count++;
            }
        }
        averageSum = sum / count;
        System.out.println("Средняя ЗП - " + averageSum + "\n===================================");
    }

    //для вывода имен всех сотрудников
    public void printNameOfEmployees() {
        for (Employee o : employees) {
            if (o != null) {
                System.out.println("ФИО сотрудника = " + o.getName());
            }

        }
        System.out.println("===================================");
    }

    //для индексирования ЗП
    public void indexSalaryByPercentage(int percent) {
        for (Employee o : employees) {
            if (o != null) {
                int currentSalary = o.getSalary();
                int indexSalary = (currentSalary + (currentSalary / 100 * percent));
                o.setSalary(indexSalary);
            }
        }
        System.out.println("====================================");
    }

    //нати сотрудника с мин ЗП по номеру отдела
    public void findMinSalaryByDepartment(int numberOfDepartment) {
        Employee employee = null;
        int min = Integer.MAX_VALUE;
        for (Employee a : employees)

            if (a != null && a.getDepartment() == numberOfDepartment && a.getSalary() < min) {
                min = a.getSalary();
                employee = a;
            }
        System.out.println("Минимальная ЗП по отделу " + numberOfDepartment + "\n- " + employee);
        System.out.println("====================================");
    }

    //нати сотрудника с max ЗП по номеру отдела
    public void findMaxSalaryByDepartment(int numberOfDepartment) {
        Employee employee = null;
        int max = -1;
        for (Employee o : employees) {

            if (o != null && o.getDepartment() == numberOfDepartment && o.getSalary() > max) {
                max = o.getSalary();
                employee = o;

            }
        }
        System.out.println("Максимальная ЗП по отделу " + numberOfDepartment + "\n- " + employee);
        System.out.println("====================================");
    }

    //сумма затрат на ЗП по отделу
    public void getTotalSalaryCostByDepartment(int department) {
        int totalCost = 0;
        for (Employee o : employees) {
            if (o != null && o.getDepartment() == department) {
                totalCost += o.getSalary();
            }
        }
        System.out.println("Суммарная ЗП по отделу " + department + " - " + totalCost);
        System.out.println("====================================");
    }

    //средняя ЗП по отделу
    public void getAverageSalaryCostByDepartment(int department) {
        int averageCost = 0;
        int count = 0;
        for (Employee o : employees) {

            if (o != null && o.getDepartment() == department) {
                averageCost += o.getSalary();
                count++;
            }
        }
        averageCost = averageCost / count;
        System.out.println("Средняя ЗП по отделу " + department + " - " + averageCost);
    }

    //индексация ЗП сотрудников одного отдела
    public void indexSalaryCostByDepartment(int department, int percent) {
        for (Employee o : employees) {

            if (o != null && o.getDepartment() == department) {
                int currentSalary = o.getSalary();
                int indexSalary = currentSalary + (currentSalary / 100 * percent);
                o.setSalary(indexSalary);
            }
        }
    }

    //напечатать всех сотрудников отдела - все данные, кроме отдела
    public void printEmployeesInDepartment(int department) {
        for (Employee o : employees) {
            if (o.getDepartment() == department) {
                System.out.println(o.getName() + " " + o.getSalary() + " " + o.getId() + "\n=======================================");
            }
        }
    }

    // Получить в качестве параметра число и найти:
    //Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public void employeesWithLessThenSalary(int paramNum) {
        for (Employee o : employees) {

            if (o != null && o.getSalary() < paramNum) {
                System.out.println("Сотрудник с ЗП меньше числа - ID " + o.getId() + " " + o.getName() + " " + o.getSalary());
            }
        }
    }

    //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. с зарплатой в консоль).
    public void employeesMoreThanSalary(int paramNum) {
        for (Employee o : employees) {
            if (o != null && o.getSalary() >= paramNum) {
                System.out.println("Сотрудники с ЗП выше, чем число - ID " + o.getId() + " " + o.getName() + " " + o.getSalary());
            }
        }
    }

    //добавляем нового сотрудника
    public void addNewEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employeeCount++;
                break;
            }
        }
    }

    //удаляем сотрудника
    public void deleteEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i] = null;
                employeeCount--;
                break;
            }
        }
    }

    //обновление даных о сотруднике
    public void updateEmployee(String name, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(name)) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
                break;
            }
        }
    }

    //напечатать список отделов и их сотрудников
    public void printAllDepartmentsAndNames() {
        for (int i = 1; i <= idDepartment; i++) {
            System.out.println("Отдел - " + i + " ");
            for (Employee o :
                    employees) {
                if (o != null && o.getDepartment() == i) {
                    System.out.println("ФИО " + o.getName());
                }
            }
        }
    }
}

