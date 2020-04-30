public class LazySingleton{
    private static  LazySingleton LazySingleton;
    private  LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(LazySingleton==null){
            LazySingleton = new LazySingleton();
        }
        return LazySingleton;
    }
}