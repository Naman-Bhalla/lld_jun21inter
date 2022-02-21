package designpatterns.structural.decorator;

public class Client {

    public static void main(String[] args) {
        // Choco Cones + Vanilla + Choco + Vanilla + Strawberry


        Cone cone = new Strawberry(
                new VanillaScoop(new ChocoScoop(
                new VanillaScoop(
                        new ChocoWafer()
                ))));
        System.out.println(cone.getPrice());
        cone.printComposition();
    }
}
