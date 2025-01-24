package decorator;

public class DecoratorSquare implements DecoratorShape {

    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}
