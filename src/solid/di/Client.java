package solid.di;

public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new PayUAPIAdapter());
        flipkart.pay();
    }
}


// classes are being created by us (programmers)
// IoC
// Dependencies will be managed by your frmaework
// SPring Boot