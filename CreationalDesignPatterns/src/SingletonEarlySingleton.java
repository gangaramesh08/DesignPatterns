public class SingletonEarlySingleton {
    private static final SingletonEarlySingleton SingletonEarlySingleton = new SingletonEarlySingleton();
    private SingletonEarlySingleton(){

    }
    public static SingletonEarlySingleton getInstance(){
        return SingletonEarlySingleton;
    }
}