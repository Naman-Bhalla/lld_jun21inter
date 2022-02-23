package designpatterns.behavioural.observer.after;

import designpatterns.factory.List;

import java.util.ArrayList;

public class Flipkart {
    private java.util.List<PaymentSuccessEventSubscriber> paymentSuccessEventSubscriberList
            = new ArrayList<>();

    public void subscribe(PaymentSuccessEventSubscriber subscriber) {
        paymentSuccessEventSubscriberList.add(subscriber);
    }

    public void unsubscribe(PaymentSuccessEventSubscriber subscriber) {
        paymentSuccessEventSubscriberList.remove(subscriber);
    }

    public void paymentSuccess(int order_id) {
        for (PaymentSuccessEventSubscriber subscriber: paymentSuccessEventSubscriberList) {
            subscriber.notify(order_id);
        }
    }
}
