public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AFFurnitue furniture =  AbstractFactoryProducer.createFurniture("chair","victorian");
        furniture.display();

        AFFurnitue furniture1 =  AbstractFactoryProducer.createFurniture("chair","modern");
        furniture1.display();

        AFFurnitue furniture2 =  AbstractFactoryProducer.createFurniture("table","victorian");
        furniture2.display();

        AFFurnitue furniture3 =  AbstractFactoryProducer.createFurniture("table","modern");
        furniture3.display();

    }
}
