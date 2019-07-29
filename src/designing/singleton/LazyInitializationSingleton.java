package designing.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton obj;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getA() {
        if (obj == null) {
            synchronized (LazyInitializationSingleton.class) {
                if (obj == null) {
                    obj = new LazyInitializationSingleton();//instance will be created at request time
                }
            }
        }
        return obj;
    }
}
//Significance of Classloader in Singleton Pattern
//If singleton class is loaded by two classloaders, two instance of singleton class will be created, one for each classloader.