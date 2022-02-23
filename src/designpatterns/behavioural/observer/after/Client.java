package designpatterns.behavioural.observer.after;

public class Client {
    // Configuration
    // send_email_on_order = true
    // send_sms_on_order = true

    private static EmailService emailService = new EmailService();
    private static SMSService smsService = new SMSService();
    private static InvoiceService invoiceService = new InvoiceService();
    private static InventoryService inventoryService = new InventoryService();

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
//        flipkart.subscribe(emailService);
        flipkart.subscribe(smsService);
        flipkart.subscribe(invoiceService);
        flipkart.subscribe(inventoryService);

        flipkart.paymentSuccess(123);

        flipkart.unsubscribe(invoiceService);

        flipkart.paymentSuccess(1234);

    }
}
