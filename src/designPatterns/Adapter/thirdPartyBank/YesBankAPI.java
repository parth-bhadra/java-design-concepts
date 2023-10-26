package src.designPatterns.Adapter.thirdPartyBank;

public class YesBankAPI {

    public float balance(String userBankAccountId) {
        // do something
        // ex - authenticate and return balance
        return 100.0f;
    }

    public void updateBankAccountDetails(String userName, String accountNumber) {
        // if something goes wrong throw an exception
    }

    public boolean pay(String fromUserId, String toUserId, double amount) {
        // do something and return true or false
        // based on whether transaction succeeded or not
        return true;
    }

}
