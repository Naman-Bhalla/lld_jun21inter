import java.util.List;

public class Client {

    public static Animal createHusky() {
        return new Husky();
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Naman";
        a.age = 21;
        a.colour = "Yellow";
        a.sayName();


        Dog d = new Dog();
        d.age = 12;
        d.name = "Tommy";
        d.breed = "Lab";
        d.bark();
        d.sayName();

        a = d;

//        d = a;

        a = new Cat();
        a = new Husky();

        Animal gh = new Dog();
        gh = new Cat();
//        gh.breed = "Lab";
//        gh.bark();

        List<Animal> animals =
                List.of(
                        new Dog(),
                        new Cat(),
                        new Dolphin(),
                        new Husky()
                );

        for (Animal as : animals) {
          as.weight = 10;
        }

        Animal ef = createHusky();// factory design pattern
        ef.name = "Tommy2";
        ef.sayName();
        // Husky (imp is of dog)
        // DOg (imp is of Animal unless I override)
        // Husky -> Dog -> Animal -> Object

        Runnable afg = new Dog();
        afg.run();
        Runnable ghi = new Horse();
        ghi.run();
        Runnable ijk = new Husky();
        ijk.run();
        Runnable lmn = new Pug();
        lmn.run();

        List<Runnable> runnables= List.of(
                new Dog(),
                new Husky()
        );
    }
}

// You don't need to know the exact data type of an object.
// You will be able to use the properties/ behaviours that you need.

