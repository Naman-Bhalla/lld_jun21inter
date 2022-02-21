package designpatterns.structural.decorator;

public class VanillaScoop implements Cone {
    private Cone cone;

    VanillaScoop(Cone cone) {
        if (cone == null) {
            throw new NullPointerException();
        }

        this.cone = cone;
    }

    @Override
    public int getPrice() {
        return this.cone.getPrice() + 30;
    }

    @Override
    public void printComposition() {
        this.cone.printComposition();
        System.out.println("VanillaScoop");
    }
}
