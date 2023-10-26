package src.designPatterns.observer;

public class NotificationService implements OrderPlacedSubscriber {
    public void onOrderPlacedAction() {
        System.out.println("Publish to notification service");
    }
}
