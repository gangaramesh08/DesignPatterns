public class EarlySingleton{
    private static final EarlySingleton EarlySingleton = new EarlySingleton();
    private EarlySingleton(){

    }
    public static EarlySingleton getInstance(){
        return EarlySingleton;
    }
}