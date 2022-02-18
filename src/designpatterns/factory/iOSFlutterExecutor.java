package designpatterns.factory;

public class iOSFlutterExecutor implements FlutterExecutor {

    @Override
    public void startApp() {

    }

    @Override
    public void printHelloWorld() {

    }

    @Override
    public FlutterExecutorUIComponentsFactory getUICompFactory() {
        return new iOSFlutterExecutorUIComponentFactory();
    }

    //
//    @Override
//    public iOSButton createList() {
//        return new iOSButton();
//    }
}
