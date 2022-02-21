package designpatterns.structural.decorator;

public class ChocoScoop implements Cone {
    private Cone cone;

    ChocoScoop(Cone cone) {
        if (cone == null) {
            throw new NullPointerException();
        }

        this.cone = cone;
    }

    @Override
    public int getPrice() {
        return this.cone.getPrice() + Menu.ChocoScoopPrice;
    }

    @Override
    public void printComposition() {
        this.cone.printComposition();
        System.out.println(MenuItems.ChocoScoop);
    }
}
