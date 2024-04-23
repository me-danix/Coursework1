public class Main {
    public static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Романова Анастасия Алексеевна", 4, 78730);
        employees[1] = new Employee("Архипов Данил Андреевич", 1, 85997);
        employees[2] = new Employee("Петрова Софья Анатольевна", 3, 81326);
        employees[3] = new Employee("Назаров Роман Андреевич", 1, 84243);
        employees[4] = new Employee("Самойлова Мария Михайловна", 4, 60634);
        employees[5] = new Employee("Кулакова Милана Даниловна", 5, 87049);
        employees[6] = new Employee("Жилин Давид Дмитриевич", 5, 64882);
        employees[7] = new Employee("Соловьев Иван Сергеевич", 1, 76772);
        employees[8] = new Employee("Плотников Максим Владимирович", 2, 91779);
        employees[9] = new Employee("Иванов Андрей Антонович", 3, 67515);

        listEmployees();
        System.out.println(getSalarySum());
        System.out.println(getMinSalary());
        System.out.println(getMaxSalary());
        System.out.println(getAverageSalary());
        listEmployeesName();
    }

    private static void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    private static double getSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee getMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    private static double getAverageSalary() {
        return getSalarySum() / employees.length;

    }

    private static void listEmployeesName(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}