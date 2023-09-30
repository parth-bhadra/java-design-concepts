package observer;

public class InventoryMangementService implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlacedAction() {
        System.out.println("Publish to inventory service");
    }

}
