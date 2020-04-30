public class AbstractFactoryProducer {
    public static AFFurnitue createFurniture(String furniture,String type){
        AFFurnitue instance =null;
        if(furniture.equalsIgnoreCase(AbstractFactoryFurnitureEnum.CHAIR.toString())){
            instance = AFChair.getChairInstance(type);
        }
        else if(furniture.equalsIgnoreCase(AbstractFactoryFurnitureEnum.TABLE.toString())){
            instance = AFTable.getTableInstance(type);
        }
        return instance;
    }
}
