package designpatterns.factory;

public class ButtonFactory {

    Button createButtonorFlatform(Platforms platforms) {
        switch (platforms) {
            case ANDROID -> new AndroidButton();
            case IOS -> new iOSButton();
        }

        return null;
    }

    Button createRandomButton() {
        return new AndroidButton();
    }
}
