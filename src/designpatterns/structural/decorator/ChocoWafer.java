package designpatterns.structural.decorator;

public class ChocoWafer implements Cone {
    private Cone cone;
    private int price = 20;

    ChocoWafer() {}

    ChocoWafer(Cone cone) { // constructor  new Chocowafer(new Cone())
        if (cone == null) {
            throw new NullPointerException();
        }

        this.cone = cone;
    }

    @Override
    public int getPrice() {
        int cost = Menu.ChocoWaferPrice;

        if (this.cone != null) {
            cost += this.cone.getPrice();
        }

        return cost;
    }

    @Override
    public void printComposition() {
        if (this.cone != null) {
            this.cone.printComposition();
        }

        System.out.println("ChocoWafer");
    }
}


// When to have a constructor of Cone?
// When this particular class can add to some otger class
// What not to have?
// This itself is the base class
