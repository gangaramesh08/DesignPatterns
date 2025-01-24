package abstractfactory;

public abstract class AbstractFactoryTable extends AbstractFactoryFurniture {

    @Override
    public int fetchLegs() {
        return 4;
    }

    @Override
    public double getPrice(String type) {
        if(type.equalsIgnoreCase(AbstractFactoryTypes.ARTDECOR.toString())){
            return 450.5;
        }
        else{
            return 550.5;
        }
    }
    public static AbstractFactoryTable getTableInstance(String type){
        AbstractFactoryTable instance = null;
        if(type.equalsIgnoreCase(AbstractFactoryTypes.MODERN.toString())){
            instance = new AbstractFactoryModernTable();
        }
        else if(type.equalsIgnoreCase(AbstractFactoryTypes.VICTORIAN.toString())){
            instance = new AbstractFactoryVictorianTable();
        }
        return instance;
    }
}
