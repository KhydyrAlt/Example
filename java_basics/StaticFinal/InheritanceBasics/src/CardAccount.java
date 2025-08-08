import java.math.BigDecimal;
import java.math.RoundingMode;

public class CardAccount extends BankAccount {
    private static final BigDecimal COMMISSION_RATE = new BigDecimal("0.01");

    @Override
    public void take(double amount) {
        validateAmount(amount);

        BigDecimal amountToTake = BigDecimal.valueOf(amount);
        BigDecimal commission = calculateCommission(amountToTake);
        BigDecimal totalAmount = amountToTake.add(commission);

        validateSufficientFunds(totalAmount);
        setBalance(getBalance().subtract(totalAmount));
    }

    private BigDecimal calculateCommission(BigDecimal amount) {
        return amount.multiply(COMMISSION_RATE)
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return String.format("CardAccount{balance=%.2f}", getAmount());
    }
}