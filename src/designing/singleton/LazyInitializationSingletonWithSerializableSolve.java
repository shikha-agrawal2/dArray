package designing.singleton;

import java.io.Serializable;

public class LazyInitializationSingletonWithSerializableSolve implements Serializable {
    private static LazyInitializationSingletonWithSerializableSolve obj;

    private LazyInitializationSingletonWithSerializableSolve() {
    }

    public static LazyInitializationSingletonWithSerializableSolve getA() {
        if (obj == null) {
            synchronized (LazyInitializationSingletonWithSerializableSolve.class) {
                if (obj == null) {
                    obj = new LazyInitializationSingletonWithSerializableSolve();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    protected Object readResolve(){
        return getA();
    }
}