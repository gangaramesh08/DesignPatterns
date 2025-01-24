package singleton;

public class ThreadSafeSingleton{
    private static ThreadSafeSingleton instance;
    private  ThreadSafeSingleton(){

    }
    public static synchronized ThreadSafeSingleton getInstance(){
        if(null==instance){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}