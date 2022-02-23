package designpatterns.behavioural.observer.before;

public class Flipkart {
    //         interface                     class (GmailEmailService)
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();
    private InventoryService inventoryService = new InventoryService();
    private InvoiceService invoiceService = new InvoiceService();

    public void paymentSuccess(int order_id) {
        emailService.sendEmail(order_id);
        smsService.sendSMS(order_id);
        invoiceService.sendInvoice(order_id);
        inventoryService.updateInventory(order_id);
//        notificatinService.sendNotification(order_id);
    }
}
