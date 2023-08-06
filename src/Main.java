public class Main {

    private static final Employee[] employees = {
            new Employee("Петров Петр Петрович",10000, 1),
            new Employee("Иванов Иван Иванович",20000, 1),
            new Employee("Михайлов Михаил Михайлович",30000, 2),
            new Employee("Васильев Василий Васильевич",40000, 2),
            new Employee("Александров Александр Александрович",50000, 3),
            new Employee("Иванова Дарья Александровна",60000, 3),
            new Employee("Алексеев Алексей Алексеевич",70000, 4),
            new Employee("Петрова Мария Ивановна",80000, 4),
            new Employee("Алексеева Алена Петровна",90000, 5),
            new Employee("Васильева Анна Михайловна",100000, 5),
    };


    public static void main(String[] args) {

        printEmployees();
        System.out.println("Сумма всех зарплат:" + totalSalary());
        System.out.println("Сотрудник с минимальной зарплатой:" + employeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой:" + employeeMaxSalary());
        System.out.println("Средняя зарплата:" + averageSalary());
        printFullNames();
    }

    public static void printEmployees() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    public static int totalSalary() {
        int salary = 0;
        for (Employee employees: employees) {
            salary += employees.getSalary();
        }

        return salary;

    }

    public static Employee employeeMinSalary() {
        Employee employeeWithMinSalary = employees[0];

        for (Employee employees: employees) {
            if(employees.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees;
            }
        }

        return  employeeWithMinSalary;
    }

    public static Employee employeeMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];

        for (Employee employees: employees) {
            if(employees.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees;
            }
        }

        return  employeeWithMaxSalary;
    }

    public static double averageSalary() {
        return totalSalary() / (double) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee: employees) {
            System.out.println(employee.getFullName());
        }
    }

}