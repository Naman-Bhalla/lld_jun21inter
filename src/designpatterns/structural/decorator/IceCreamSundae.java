package designpatterns.structural.decorator;

public interface IceCreamSundae {

    int getPrice();
    void printComposition();
    SundaeType getType();
}


// Make the decorator pattern support this behaviour:
// Either you can construct a cone type thing
// Or you can construct a cup
// eg: Choco cone + vanilla cone + choco scoop + vanilla scoop
// Cup + Cup + choco scoop + vanilla scoop
// This is not allowed Cup + scoop + CUp
// This is not allowed Cone + Cone + Scoop + Cone
// But not both
// In one cup you can have number of cups and same for cone


