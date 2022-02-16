package solid.liskov;

public class Penguin extends Bird {

    @Override
    public void fly() {
        System.out.println("This can't fly");
//        throw new FlyBehaviourNotSupportedException();
    }
}
