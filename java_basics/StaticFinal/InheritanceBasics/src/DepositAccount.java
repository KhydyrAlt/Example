import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    @Override
    public void put(double amount) {
        if (amount > 0) {
            super.put(amount);
            lastIncome = LocalDate.now();
        }
    }

    @Override
    public void take(double amount) {
        if (amount <= 0 || amount > getAmount() || !canWithdraw()) {
            return;
        }
        super.take(amount);
    }

    private boolean canWithdraw() {
        return lastIncome == null ||
                ChronoUnit.MONTHS.between(lastIncome, LocalDate.now()) >= 1;
    }
}
