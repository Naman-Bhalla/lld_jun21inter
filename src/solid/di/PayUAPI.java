package solid.di;

enum TransactionStatus {
    SUCCESS,
    FAILURE,
    PROGRESS,
}
public class PayUAPI {

    public boolean putCardDetails(
            Long cardNumber,
            int expiryMonth,
            int expiryYear,
            int cvv,
            String name
    ) {
        return true;
    }

    public void startTransaction(int lastThreeDigits) {

    }

    public boolean checkStatus(int lastThreeTransactionID) {
        return true;
    }

}
