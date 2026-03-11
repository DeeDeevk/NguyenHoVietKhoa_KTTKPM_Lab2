package singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    private static class SingletonHelper {
        static final SingletonSerializable INSTANCE = new SingletonSerializable();
    }

    private SingletonSerializable() {
    }

    public static SingletonSerializable getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private Object readResolve(){
        return SingletonHelper.INSTANCE;
    }

}
