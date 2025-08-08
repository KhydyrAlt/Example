public class CardAccount extends BankAccount {
    private static final double COMMISSION_RATE = 0.01;

    @Override
    public void take(double amount) {
        if (amount <= 0)  {
            return;
        }
        double amountWithCommission = amount * (1 + COMMISSION_RATE);
        if (amountWithCommission <= getAmount()) {
            super.take(amountWithCommission);
        }
    }
}


