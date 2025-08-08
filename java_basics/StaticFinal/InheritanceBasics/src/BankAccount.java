import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private BigDecimal balance;

    public BankAccount() {
        this.balance = BigDecimal.ZERO;
    }

    public final double getAmount() {
        return balance.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public void put(double amount) {
        validateAmount(amount);
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void take(double amount) {
        validateAmount(amount);
        BigDecimal amountToTake = BigDecimal.valueOf(amount);
        validateSufficientFunds(amountToTake);
        balance = balance.subtract(amountToTake);
    }

    protected final void validateAmount(double amount) {
        if (amount <= 0 || !Double.isFinite(amount)) {
            throw new IllegalArgumentException("Сумма должна быть положительным числом");
        }
    }

    protected final void validateSufficientFunds(BigDecimal amount) {
        if (amount.compareTo(balance) > 0) {
            throw new IllegalStateException("Недостаточно средств");
        }
    }

    protected final BigDecimal getBalance() {
        return balance;
    }

    protected final void setBalance(BigDecimal newBalance) {
        this.balance = newBalance;
    }
}