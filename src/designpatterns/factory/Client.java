package designpatterns.factory;

public class Client {
    public static void main(String[] args) {
        FlutterExecutor flutterExecutor = FlutterExecutorFactory
                .createExecutrBasedOnPlatform(Platforms.IOS);
        Button b = flutterExecutor.getUICompFactory().createButton();

//        Button button = flutterExecutor.createList();
    }
}
