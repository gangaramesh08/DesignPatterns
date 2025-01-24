package singleton;

public class SingletonLazySingleton {
    private static SingletonLazySingleton SingletonLazySingleton;
    private SingletonLazySingleton(){

    }
    public static SingletonLazySingleton getInstance(){
        if(SingletonLazySingleton ==null){
            SingletonLazySingleton = new SingletonLazySingleton();
        }
        return SingletonLazySingleton;
    }
}