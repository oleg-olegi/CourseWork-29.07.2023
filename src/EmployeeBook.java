public class EmployeeBook {
    private Employee[] employees;
    private int employeeCount;

    //getter для доступа к элементам массива
    public Employee[] getEmployees() {
        return employees;
    }

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
}

