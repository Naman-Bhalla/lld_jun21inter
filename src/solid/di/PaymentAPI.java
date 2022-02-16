package solid.di;

public interface PaymentAPI {
    void insertCardValues(
            String cardNumber,
            int expiryMonth,
            int expiryYear,
            int cvv,
            String name
    );

    boolean startTransaction(int transactionId);

    boolean checkCompletion(int transactionId);
}
