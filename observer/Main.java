package observer;

public class Main {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        InventoryMangementService inventoryMangementService = new InventoryMangementService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        NotificationService notificationService = new NotificationService();

        amazon.register(inventoryMangementService);
        amazon.register(invoiceGenerator);
        amazon.register(notificationService);

        amazon.orderPlaced();

        amazon.deRegister(inventoryMangementService);

        System.out.println("---------------");

        amazon.orderPlaced();
    }
}
