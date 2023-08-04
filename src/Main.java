import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 1000));
        employeeBook.addEmployee(new Employee("Туманов Алексей Сергеевич", 1, 200));
        employeeBook.addEmployee(new Employee("Петров Петр Петрович", 2, 1200));
        employeeBook.addEmployee(new Employee("Сидоров Сидр Сидорович", 3, 125));
        employeeBook.addEmployee(new Employee("Кузнецов Илларион Феофилович", 4, 1500));
        employeeBook.addEmployee(new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000));

        employeeBook.deleteEmployee("Туманов Алексей Сергеевич");
        employeeBook.addNewEmployee(new Employee("Рембо Сильвестр Сталлонович", 1, 500));
        employeeBook.printNameOfEmployees();
        employeeBook.printAllEmployees();
        employeeBook.printAllDepartmentsAndNames();

     /*   employeeBook.printAllEmployees();
        employeeBook.minSalaryEmployee();
        employeeBook.maxSalaryEmployee();
        employeeBook.averageSalary();
        employeeBook.printNameOfEmployees();
        employeeBook.sumSalary();
        employeeBook.indexSalaryByPercentage(25);
        employeeBook.sumSalary();
        employeeBook.findMinSalaryByDepartment(1);*/
    }
}
