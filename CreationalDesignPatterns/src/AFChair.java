public abstract class AFChair extends AFFurnitue{


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
    public static AFChair getChairInstance(String type){
        AFChair instance = null;
        if(type.equalsIgnoreCase(AbstractFactoryTypes.MODERN.toString())){
            instance = new AFModernChair();
        }
        else if(type.equalsIgnoreCase(AbstractFactoryTypes.VICTORIAN.toString())){
            instance = new AFVictorianChair();
        }
        return instance;
    }
}
