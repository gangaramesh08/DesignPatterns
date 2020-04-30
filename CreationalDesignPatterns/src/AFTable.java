public abstract class AFTable extends AFFurnitue{

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
    public static AFTable getTableInstance(String type){
        AFTable instance = null;
        if(type.equalsIgnoreCase(AbstractFactoryTypes.MODERN.toString())){
            instance = new AFModernTable();
        }
        else if(type.equalsIgnoreCase(AbstractFactoryTypes.VICTORIAN.toString())){
            instance = new AFVictorianTable();
        }
        return instance;
    }
}
