package designing.singleton;

public class EarlyInitializationSingleton {
    private static EarlyInitializationSingleton obj = new EarlyInitializationSingleton();//Early, instance will be created at load time

    private EarlyInitializationSingleton() {
    }

    public static EarlyInitializationSingleton getA() {
        return obj;
    }
}
