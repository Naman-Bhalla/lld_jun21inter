package solid.di;

public class Flipkart {
    PaymentAPI api;

    Flipkart(PaymentAPI api) {
        this.api = api;
    }

    void pay() {
      api.insertCardValues(
              "0101010101010101L",
              01,
              2121,
              121,
              "Naman"
      );

      api.startTransaction(123);
      while (api.checkCompletion(123) != true) {
          //pause
      }

    }
}
