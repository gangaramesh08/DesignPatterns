package decorator;

public class DecoratorSportsCar extends DecoratorForCar{

    public DecoratorSportsCar(DecoratorCar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("sports car assembly added");
    }
}
