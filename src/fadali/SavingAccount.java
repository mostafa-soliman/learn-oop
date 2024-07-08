package fadali;

public class SavingAccount extends Account {
  private double interestRate;

  public SavingAccount(String accountNumber, double balance, double interestRate) {
    super(accountNumber, balance);
    this.interestRate = interestRate;
  }

  public double addInterest() {
    return balance += balance * interestRate;
  }
}
