package Adapter;

public interface BankApiAdapter {
    int getBalance(String userBankAccountId);
    boolean addBankAccount(String userName, String bankAccountNumber);
    boolean transfer(String fromUserName, String toUserName, int amount);



}
