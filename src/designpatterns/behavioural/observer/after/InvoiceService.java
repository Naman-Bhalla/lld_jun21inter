package designpatterns.behavioural.observer.after;

public class InvoiceService implements PaymentSuccessEventSubscriber {

    public void sendInvoice(int order_id) {
        System.out.println("In Invoice Service");

    }

    @Override
    public void notify(int order_id) {
        sendInvoice(order_id);
    }
}
