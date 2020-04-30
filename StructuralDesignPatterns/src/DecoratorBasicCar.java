public class DecoratorBasicCar implements DecoratorCar {
    @Override
    public void assemble() {
        System.out.println("Assembling new car");
    }
}
