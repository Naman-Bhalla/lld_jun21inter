public class Animal implements Eatable {

    String name;
    String colour;
    int age;
    int weight;

    void sayName() {
        System.out.println("My name is " + name);
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
}
