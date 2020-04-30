public class DecoratorDemo {
    public static void main(String[] args) {
        DecoratorCar sports = new DecoratorSportsCar(new DecoratorBasicCar());
        sports.assemble();
        DecoratorCar luxurySports = new DecoratorSportsCar(new DecoratorLuxuryCar(new DecoratorBasicCar()));
        luxurySports.assemble();
    }
}
