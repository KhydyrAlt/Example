public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public double getAmount() {
        return balance;
    }

    // Добавляем метод, который ожидают тесты
    public double getAmountToPut() {
        return balance;
    }

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
