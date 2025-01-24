package singleton;

public class SingletonPughBillSingleton {
    private SingletonPughBillSingleton(){

    }
    private static class Inner{
        public static final SingletonPughBillSingleton INSTANCE = new SingletonPughBillSingleton();
        static{
            System.out.println("Hello");
        }
    }
    public static SingletonPughBillSingleton getInstance(){

        return Inner.INSTANCE;
    }
}