package Adapter.thirdPartyBank;

public class BankAccountDetails {
    private String userName;
    private String accountNumber;
    private String isfcCode;

    public BankAccountDetails(String userName, String accountNumber, String ifscCode) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.isfcCode = ifscCode;
    }

    public BankAccountDetails() {

    }

}
