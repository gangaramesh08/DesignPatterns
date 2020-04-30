public class DecoratorForCar implements DecoratorCar {

    DecoratorCar car;

    public DecoratorForCar(DecoratorCar car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
