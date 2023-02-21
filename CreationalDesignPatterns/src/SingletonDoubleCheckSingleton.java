public class SingletonDoubleCheckSingleton {
    private static SingletonDoubleCheckSingleton instance;
    private SingletonDoubleCheckSingleton(){

    }
    public static SingletonDoubleCheckSingleton getInstance(){
        if(instance ==null){
            synchronized (SingletonDoubleCheckSingleton.class){
                if(instance==null){
                    instance = new SingletonDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}