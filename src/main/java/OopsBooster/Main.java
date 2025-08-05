package OopsBooster;

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(100000, "ABC12234", "BankA");
        bank.depositAmount(25000);
        bank.depositAmount(-3000);

        bank.withDrawAmount(5000000);
        bank.withDrawAmount(300);

        SavingsAccount acc = new SavingsAccount(30000, "ABCSavings", "BOB");
        acc.withDrawAmount(26000);
    }
}
