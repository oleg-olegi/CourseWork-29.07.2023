import java.util.ArrayList;

public class Main {
    //для вывода списка всех сотрудников
    public static void printEmpl(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
                System.out.println("=======================================");
            }
        }
    }

    //для вывода суммы зарплат всех сотрудников
    public static float sumSalary(Employee[] arr) {
        int sum = 0;
        for (Employee a : arr) {
            if (a != null) {
                sum = sum + a.getSalary();
            }
        }
        return sum;
    }

    // для вывода сотрудника с минимальной ЗП
    public static Employee minSalary(Employee[] arr) {
        int index = 0;
        int min = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                    index = i;
                }
            }
        }

        return arr[index];
    }

    // для вывода сотрудника с максиимальной ЗП
    public static Employee maxSalary(Employee[] arr) {
        int ind = 0;
        int max = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                    ind = i;
                }
            }
        }
        return arr[ind];
    }

    //для вывода средней ЗП
    public static int averageSalary(Employee[] arr) {
        int sum = 0;
        int count = 0;
        for (Employee a : arr) {
            if (a != null) {
                sum = sum + a.getSalary();
                count++;
            }
        }
        return sum / count;
    }

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


    public static void main(String[] args) {
        Employee[] employeesList = new Employee[10];
        int employeeCount = 0;

        employeesList[employeeCount++] = new Employee("Иванов Иван Иванович", 1, 1000);
        employeesList[employeeCount++] = new Employee("Туманов Алексей Сергеевич", 1, 200);
        employeesList[employeeCount++] = new Employee("Петров Петр Петрович", 2, 1200);
        employeesList[employeeCount++] = new Employee("Сидоров Сидр Сидорович", 3, 125);
        employeesList[employeeCount++] = new Employee("Кузнецов Илларион Феофилович", 4, 1500);
        employeesList[employeeCount++] = new Employee("Ковалев Владимир Красносолнышко", 5, 1_000_000);

        indexSalaryByPercentage(employeesList, 20);

        printEmpl(employeesList);
        System.out.println(sumSalary(employeesList));
        System.out.println("minSalary(employeesList) = " + minSalary(employeesList));
        System.out.println("maxSalary(employeesList) = " + maxSalary(employeesList));
        printNameOfEmployees(employeesList);
        System.out.println(findMinSalaryByDepartment(employeesList, 1));
    }
}
