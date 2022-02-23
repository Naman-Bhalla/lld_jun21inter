package designpatterns.factory;

public class AndroidFlutterExecutorUIComponentFactory implements FlutterExecutorUIComponentsFactory {

    @Override
    public List createList() {
        return null;
    }

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}

// Factory.getInstanceOfType(type) {
//   switch()
// }
// Factory.getButto()
// Factory.getList();

