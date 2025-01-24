package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactoryFurniture furniture =  AbstractFactoryProducer.createFurniture("chair","victorian");
        furniture.display();

        AbstractFactoryFurniture furniture1 =  AbstractFactoryProducer.createFurniture("chair","modern");
        furniture1.display();

        AbstractFactoryFurniture furniture2 =  AbstractFactoryProducer.createFurniture("table","victorian");
        furniture2.display();

        AbstractFactoryFurniture furniture3 =  AbstractFactoryProducer.createFurniture("table","modern");
        furniture3.display();

    }
}
