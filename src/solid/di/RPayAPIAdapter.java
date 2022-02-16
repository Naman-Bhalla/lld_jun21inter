package solid.di;

public class RPayAPIAdapter implements PaymentAPI {
    RazorpayAPI razorpayAPI = new RazorpayAPI();

    @Override
    public void insertCardValues(String cardNumber, int expiryMonth, int expiryYear, int cvv, String name) {

    }

    @Override
    public boolean startTransaction(int transactionId) {
        return false;
    }

    @Override
    public boolean checkCompletion(int transactionId) {
        return false;
    }
}
