public class FactoryConfig {
    public FactoryInterface getInstance(String type){
        FactoryInterface instance = null;
        if(type.equalsIgnoreCase("1")){
            instance = new FactoryImpl1();
        }
        else if(type.equalsIgnoreCase("2")){
            instance = new FactoryImpl2();
        }
        return instance;
    }
}

