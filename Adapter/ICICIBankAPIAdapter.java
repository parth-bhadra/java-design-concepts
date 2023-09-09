package Adapter;

import Adapter.thirdPartyBank.BankAccountDetails;
import Adapter.thirdPartyBank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankApiAdapter {
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public int getBalance(String userBankAccountId) {
        int balance = (int)iciciBankAPI.checkBalance("customerId");
        return balance;
    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        BankAccountDetails bankAccountDetails = new BankAccountDetails(userName, bankAccountNumber, "001");
        return 'Y' == iciciBankAPI.addBankAccount(bankAccountDetails);
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        BankAccountDetails from = new BankAccountDetails(fromUserName, "1", "001");
        BankAccountDetails to = new BankAccountDetails(toUserName, "2", "001");
        return 'Y' == iciciBankAPI.makePayment(from, to, amount);
    }
}
