public interface Employee {
    double getMonthSalary();
}

class Operator implements Employee {
    private final double fixedSalary;

    public Operator() {
        this.fixedSalary = 25000 + Math.random() * 10000; // 25-35 тыс
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary;
    }
}

class Manager implements Employee {
    private final double fixedSalary;
    private final double generatedIncome;

    public Manager() {
        this.fixedSalary = 40000 + Math.random() * 20000; // 40-60 тыс
        this.generatedIncome = 115000 + Math.random() * 25000; // 115-140 тыс
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary + generatedIncome * 0.05; // 5% бонус
    }

    public double getGeneratedIncome() {
        return generatedIncome;
    }
}

class TopManager implements Employee {
    private final double fixedSalary;
    private final Company company;

    public TopManager(Company company) {
        this.fixedSalary = 80000 + Math.random() * 40000; // 80-120 тыс
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return company.getIncome() > 10000000
                ? fixedSalary * 2.5 // 150% бонус
                : fixedSalary;
    }
}
