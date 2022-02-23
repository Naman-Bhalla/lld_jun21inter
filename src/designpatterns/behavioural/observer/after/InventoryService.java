package designpatterns.behavioural.observer.after;

public class InventoryService implements PaymentSuccessEventSubscriber {

    public void updateInventory(int order_id) {
        System.out.println("In Inventory Service");

    }

    @Override
    public void notify(int order_id) {
        updateInventory(order_id);
    }
}
