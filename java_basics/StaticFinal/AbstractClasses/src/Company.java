import java.util.*;
import java.util.stream.Collectors;

public class Company {
    private final List<Employee> employees = new ArrayList<>();
    private double income;

    public void hire(Employee employee) {
        employees.add(employee);
        if (employee instanceof Manager) {
            income += ((Manager) employee).getGeneratedIncome();
        }
    }

    public void hireAll(Collection<? extends Employee> employees) {
        this.employees.addAll(employees);
        this.income = this.employees.stream()
                .filter(e -> e instanceof Manager)
                .mapToDouble(e -> ((Manager) e).getGeneratedIncome())
                .sum();
    }

    public void fire(Employee employee) {
        if (employees.remove(employee) && employee instanceof Manager) {
            income -= ((Manager) employee).getGeneratedIncome();
        }
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getMonthSalary).reversed())
                .limit(Math.max(0, Math.min(count, employees.size())))
                .collect(Collectors.toList());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getMonthSalary))
                .limit(Math.max(0, Math.min(count, employees.size())))
                .collect(Collectors.toList());
    }

    public int getEmployeeCount() {
        return employees.size();
    }
}
