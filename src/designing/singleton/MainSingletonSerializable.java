package designing.singleton;

import java.io.*;

public class MainSingletonSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LazyInitializationSingletonWithSerializableSolve singleton = LazyInitializationSingletonWithSerializableSolve.getA();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.text"));
        objectOutputStream.writeObject(singleton);
        System.out.println(singleton);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("a.text"));
        LazyInitializationSingletonWithSerializableSolve singleton1 = (LazyInitializationSingletonWithSerializableSolve) objectInputStream.readObject();
        System.out.println(singleton1);
        //o/p without read resolve in singleton class
        // - designing.singleton.LazyInitializationSingletonWithSerializableSolve@7f31245a
        //designing.singleton.LazyInitializationSingletonWithSerializableSolve@4dd8dc3

        //o/p with readResolve in singleton class i.e same object is returned
        //designing.singleton.LazyInitializationSingletonWithSerializableSolve@7f31245a
        //designing.singleton.LazyInitializationSingletonWithSerializableSolve@7f31245a




    }
}
