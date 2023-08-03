public class EmployeeBook {
    private Employee[] employees;
    private int employeeCount;

    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
        employeeCount = 0;
    }

    //добавляем нового сотрдника в массив
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        }
    }

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
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (min > employees[i].getSalary()) {
                    min = employees[i].getSalary();
                    index = i;
                }
            }
        }
        System.out.println("Сотрудник с МИН ЗП - "+employees[index]+"\n======================================");
    }
    // для вывода сотрудника с максиимальной ЗП
    public void maxSalaryEmployee() {
        int ind = 0;
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (max < employees[i].getSalary()) {
                    max = employees[i].getSalary();
                    ind = i;
                }
            }
        }
        System.out.println("Сотрудник с MAX ЗП - "+employees[ind]+"\n======================================");
    }
}

