package designpatterns.factory;

public interface FlutterExecutor {

    void startApp();

    void printHelloWorld();

    FlutterExecutorUIComponentsFactory getUICompFactory();
//     Button createList();
}

// 1. Factory Class:
//       XFactory
//   Return objects of class X or any class that IS-A x

// 2. Factory Method
//  A method in a normal class that tends to create an objectr of a subclass of a parent class.
// Eg: createButton() -> Button or any of its subclasses

// 3. Abstract Factory
// A class that has a collection of methods each creating an object of partticular type

//interface DressFactory { abstract class
//    Shirt createShirt();
//    Trouser createTrouser();
//}
//
//class WinterDressFactory {
//
//    Shirt createShirt() {
//        return new WoolenShirt();
//    }
//
//    Trouser createTrouser() {
//        return new WhiteTrouser();
//    }
//}

//class DressFactory { Factory CLass
//    Dress createWinterDress() {
//        return new Dress(new WoolenShirt(), new WhiteTrouser());
//    }
//
//    Dress createSummerDress() {
//        return new Dress(new SummerSHirt(), new SummerTrouser());
//    }
//
//}

// Prototype Design pattern 5 min break. 10: 50 PM
// 11: 20PM<