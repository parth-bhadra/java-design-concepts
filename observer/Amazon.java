package observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscriberList;
    List<OrderCancelledSubscriber> orderCancelledSubscriberList;

    public Amazon() {
        this.orderPlacedSubscriberList = new ArrayList<>();
        this.orderCancelledSubscriberList = new ArrayList<>();
    }

    public void register(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void deRegister(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    // add another register and deregister for orderCancelledSubscribers

    public void orderPlaced() {
        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscriberList) {
            orderPlacedSubscriber.onOrderPlacedAction();
        }
    }
}
