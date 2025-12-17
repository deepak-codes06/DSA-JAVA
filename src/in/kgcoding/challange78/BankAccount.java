package in.kgcoding.challange78;

public class BankAccount {
    private int accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if(money <= 0){
            System.out.println("ERROR");
        }else
        balance += money;
    }

    public double withdrawMoney(double money){
       if(money == balance){
           balance -= money;
           balance=0;
       } else if (money > balance) {
           System.out.println("give correct amount: ");
       }
           balance -= money;


        return money;
    }
}
