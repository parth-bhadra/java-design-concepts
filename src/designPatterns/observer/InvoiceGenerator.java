package src.designPatterns.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {
    public void onOrderPlacedAction() {
        System.out.println("Publish to invoice service");
    }
}
