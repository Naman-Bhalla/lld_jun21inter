package solid.liskov;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Bird> birds = List.of(
                new Penguin(),
                new Sparrow(),
                new Pigeon()
        );

        for (Bird b: birds) {
            b.fly();
        }

        Bird b = new Sparrow();

        b.fly();

        // b.doSomething();
        // b.doSomethingElse();
    }
}
