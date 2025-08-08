import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncomeDate = LocalDate.MIN;
    private static final int WITHDRAWAL_LOCK_DAYS = 30;

    @Override
    public final void put(double amount) {
        validateAmount(amount);
        super.put(amount);
        lastIncomeDate = LocalDate.now();
    }

    @Override
    public void take(double amount) {
        validateAmount(amount);

        if (!canWithdraw()) {
            throw new IllegalStateException(
                    "Снятие невозможно до " + lastIncomeDate.plusDays(WITHDRAWAL_LOCK_DAYS)
            );
        }

        super.take(amount);
    }

    private boolean canWithdraw() {
        long daysPassed = ChronoUnit.DAYS.between(lastIncomeDate, LocalDate.now());
        return daysPassed >= WITHDRAWAL_LOCK_DAYS;
    }

    @Override
    public String toString() {
        return String.format(
                "DepositAccount{balance=%.2f, lastIncomeDate=%s, canWithdraw=%b}",
                getAmount(),
                lastIncomeDate,
                canWithdraw()
        );
    }
}