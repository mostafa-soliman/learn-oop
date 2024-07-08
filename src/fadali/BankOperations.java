package fadali;

public class BankOperations implements AccountOperations {
    Account fromAccount;
    Account toAccount;

    public BankOperations(Account fromAccount, Account toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    @Override
    public void transfer(double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance and overdraft limit exceeded");
        }
    }
}
