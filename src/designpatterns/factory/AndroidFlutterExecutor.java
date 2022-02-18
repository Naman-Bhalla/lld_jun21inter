package designpatterns.factory;

public class AndroidFlutterExecutor implements FlutterExecutor {

//    @Override
//    public AndroidButton createList() {
//        return new AndroidButton();
//    }


    @Override
    public void printHelloWorld() {

    }

    @Override
    public void startApp() {

    }

    @Override
    public FlutterExecutorUIComponentsFactory getUICompFactory() {
        return new AndroidFlutterExecutorUIComponentFactory();
    }
}
