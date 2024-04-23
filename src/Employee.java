import java.util.Objects;

public class Employee {
    private final String fullName;
    private int dept;
    private double salary;
    private final int id;

    private static int CALCULATOR = 1;

    public Employee(String fullName, int dept, double salary) {
        this.fullName = fullName;
        this.dept = dept;
        this.salary = salary;
        this.id = CALCULATOR++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dept == employee.dept && Double.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, dept, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                '}';
    }
}
