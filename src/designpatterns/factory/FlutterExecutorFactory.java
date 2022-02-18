package designpatterns.factory;

public class FlutterExecutorFactory {

    public static FlutterExecutor createExecutrBasedOnPlatform(Platforms platforms) {
        switch (platforms) {
            case IOS -> {
                return new iOSFlutterExecutor();
            }
            case ANDROID -> {
                return new AndroidFlutterExecutor();
            }
        }

        return null;
    }
}
