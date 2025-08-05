package OopsBooster;

import java.util.Objects;

public class BankAccount implements Transactionable {
    private double balance;
    private String banKAccountNumber;
    private String accountHolderName;

    public BankAccount(double balance, String banKAccountNumber, String accountHolderName) {
        this.balance = balance;
        this.banKAccountNumber = banKAccountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBanKAccountNumber() {
        return banKAccountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(banKAccountNumber, that.banKAccountNumber) && Objects.equals(accountHolderName, that.accountHolderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, banKAccountNumber, accountHolderName);
    }

    @Override
    public void depositAmount(double amount){
        if(amount < 0){
            System.out.println("Cant deposit negative amounts");
        }
        else {
            this.balance = this.getBalance() + amount;
            remainingBalance();
        }
    }

    @Override
    public void withDrawAmount(double amount) {
        if(amount >50000){
            System.out.println("Oops! Can't Withdraw a sum of " + amount);
        }
        else if(this.getBalance() < amount) {
            System.out.println("Not enough fund. You have a sum of " + amount);
        }
        else {
            this.balance = this.getBalance() - amount;
            remainingBalance();
        }
    }

    private void remainingBalance() {
        System.out.println("You have a balance of " +this.getBalance());
    }
}
