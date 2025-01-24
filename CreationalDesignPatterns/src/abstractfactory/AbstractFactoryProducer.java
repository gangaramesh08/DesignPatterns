package abstractfactory;

public class AbstractFactoryProducer {
    public static AbstractFactoryFurniture createFurniture(String furniture, String type){
        AbstractFactoryFurniture instance =null;
        if(furniture.equalsIgnoreCase(AbstractFactoryFurnitureEnum.CHAIR.toString())){
            instance = AbstractFactoryChair.getChairInstance(type);
        }
        else if(furniture.equalsIgnoreCase(AbstractFactoryFurnitureEnum.TABLE.toString())){
            instance = AbstractFactoryTable.getTableInstance(type);
        }
        return instance;
    }
}
