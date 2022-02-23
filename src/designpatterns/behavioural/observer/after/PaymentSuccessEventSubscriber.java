package designpatterns.behavioural.observer.after;

public interface PaymentSuccessEventSubscriber {

    void notify(int order_id);
}

// 10 min break
// 10: 30 -> Strategy Design Pattern


// Observer:
// There is an event that will occur somewhere in my codebase
// When that event occurs we have to perform multiple actions
// Action Classes will observe the event by registering themselves (subscribing) to the event class
// Observer

// Tradiiton Approach: Parent calls the action
// Action subscribes to an event. Partents calls listener of event