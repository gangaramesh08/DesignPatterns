package decorator;

public class DecoratorLuxuryCar extends DecoratorForCar{

    public DecoratorLuxuryCar(DecoratorCar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("luxury car assembly added");
    }
}
