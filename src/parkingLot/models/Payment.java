package src.parkingLot.models;

import src.parkingLot.models.constants.PaymentStatus;

public class Payment extends BaseModel {
    private int amount;
    private PayementMode payementMode;
    private String transactionNumber;
    private PaymentStatus paymentStatus;
    private Bill bill;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PayementMode getPayementMode() {
        return payementMode;
    }

    public void setPayementMode(PayementMode payementMode) {
        this.payementMode = payementMode;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
