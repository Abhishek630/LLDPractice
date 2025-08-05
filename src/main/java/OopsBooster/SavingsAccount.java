package OopsBooster;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, String banKAccountNumber, String accountHolderName) {
        super(balance, banKAccountNumber, accountHolderName);
    }

    @Override
    public void withDrawAmount(double amount){
        if(amount >25000){
            System.out.println("Oops! Can't Withdraw a sum of " + amount);
        }
        else if(this.getBalance() < amount) {
            System.out.println("Not enough fund. You have a sum of " + amount);
        }
        else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("You have a balance of "+this.getBalance());
        }
    }
}
