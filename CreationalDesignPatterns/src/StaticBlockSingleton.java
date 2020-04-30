public class StaticBlockSingleton{
    private static StaticBlockSingleton instance;
    private  StaticBlockSingleton(){

    }
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception exception){

        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}