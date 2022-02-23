package designpatterns.behavioural.observer.after;

public class EmailService implements PaymentSuccessEventSubscriber {

    public void sendEmail(int order_id) {
        System.out.println("In EMail Service");
    }

    @Override
    public void notify(int order_id) {
        sendEmail(order_id);
    }
}


// Behaviour:
// An event occurs
// Based upon occurrence of an event, we might want todo multiple things
// Wrong Way: Put the code of calling each service in the method
// Good Way: Make each ervice a subscriber
//           Make each event owner a publisher