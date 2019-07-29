package designing.singleton;

import java.io.Serializable;

public class LazyInitializationSingletonWithSerializable implements Serializable {
    private static LazyInitializationSingletonWithSerializable obj;

    private LazyInitializationSingletonWithSerializable() {
    }

    public static LazyInitializationSingletonWithSerializable getA() {
        if (obj == null) {
            synchronized (LazyInitializationSingletonWithSerializable.class) {
                if (obj == null) {
                    obj = new LazyInitializationSingletonWithSerializable();//instance will be created at request time
                }
            }
        }
        return obj;
    }
}