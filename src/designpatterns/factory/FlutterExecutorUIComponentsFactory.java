package designpatterns.factory;

public interface FlutterExecutorUIComponentsFactory {
    List createList();

    Button createButton();

    Menu createMenu();
}
