package designpatterns.structural.decorator;

public class Strawberry implements Cone {
    private Cone cone;

    Strawberry(Cone cone) {
        if (cone == null) {
            throw new NullPointerException();
        }

        this.cone = cone;
    }

    @Override
    public int getPrice() {
        return this.cone.getPrice() + 10;
    }

    @Override
    public void printComposition() {
        this.cone.printComposition();
        System.out.println("Strawberry");
    }
}
