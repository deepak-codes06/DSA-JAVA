package in.kgcoding.challange78;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(45757,"Deepak kumar");


        bankAccount.depositMoney(1000.00);
        System.out.println(bankAccount.withdrawMoney(575.30));
        bankAccount.depositMoney(-55.24);
        bankAccount.withdrawMoney(-77);
        bankAccount.withdrawMoney(78888);

    }
}
