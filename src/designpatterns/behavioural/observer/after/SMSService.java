package designpatterns.behavioural.observer.after;

public class SMSService implements PaymentSuccessEventSubscriber {

    public void sendSMS(int order_id) {
        System.out.println("In SMS Service");

    }

    @Override
    public void notify(int order_id) {
        sendSMS(order_id);
    }
}
