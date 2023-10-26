package src.designPatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platform) {
        switch (platform) {
            case ANDROID:
                return new AndroidUIFactory();
            case IOS:
                return new IOSUIFactory();
            default:
                return null;
        }
    }
}

/*

 */
