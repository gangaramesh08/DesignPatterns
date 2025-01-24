package abstractfactory;

public abstract class AbstractFactoryChair extends AbstractFactoryFurniture {


    @Override
    public int fetchLegs() {
        return 4;
    }

    @Override
    public double getPrice(String type) {
        if(type.equalsIgnoreCase(AbstractFactoryTypes.ARTDECOR.toString())){
            return 250.5;
        }
        else{
            return 350.5;
        }
    }
    public static AbstractFactoryChair getChairInstance(String type){
        AbstractFactoryChair instance = null;
        if(type.equalsIgnoreCase(AbstractFactoryTypes.MODERN.toString())){
            instance = new AbstractFactoryModernChair();
        }
        else if(type.equalsIgnoreCase(AbstractFactoryTypes.VICTORIAN.toString())){
            instance = new AbstractFactoryVictorianChair();
        }
        return instance;
    }
}
