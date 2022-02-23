package designpatterns.factory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        FlutterExecutor flutterExecutor = FlutterExecutorFactory
                .createExecutrBasedOnPlatform(Platforms.IOS);
        Button b = flutterExecutor.getUICompFactory().createButton();

    }
}
