package Adapter;

public class PhonePe {

    private BankApiAdapter bankApiAdapter;

    public PhonePe(String bankName) {
        this.bankApiAdapter = new ICICIBankAPIAdapter();
    }

    public void getBalance() {
        double balance = bankApiAdapter.getBalance("userBankAccountId");
        System.out.println("Balance is: "+ balance);

    }

    public void addBankAccount() {

    }

    public void transferAmount() {

    }
}
