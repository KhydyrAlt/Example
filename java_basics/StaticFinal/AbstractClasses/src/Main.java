import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Найм сотрудников
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i++) employees.add(new Operator());
        for (int i = 0; i < 80; i++) employees.add(new Manager());
        for (int i = 0; i < 10; i++) employees.add(new TopManager(company));

        company.hireAll(employees);

        System.out.println("=== До увольнений ===");
        printResults(company);

        // Увольнение 50%
        int toFire = company.getEmployeeCount() / 2;
        List<Employee> toFireList = company.getLowestSalaryStaff(toFire);
        toFireList.forEach(company::fire);

        System.out.println("\n=== После увольнения " + toFire + " сотрудников ===");
        printResults(company);
    }

    private static void printResults(Company company) {
        System.out.printf("Доход компании: %.2f руб.%n", company.getIncome());
        System.out.println("Топ-15 зарплат:");
        printSalaries(company.getTopSalaryStaff(15));
        System.out.println("\n30 самых низких зарплат:");
        printSalaries(company.getLowestSalaryStaff(30));
    }

    private static void printSalaries(List<Employee> employees) {
        employees.forEach(e ->
                System.out.printf("%s: %.2f руб.%n",
                        e.getClass().getSimpleName(),
                        e.getMonthSalary()
                )
        );
    }
}
