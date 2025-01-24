package decorator;

public class DecoratorForShape implements DecoratorShape{
    private DecoratorShape shape;

    public DecoratorForShape(DecoratorShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
    }
}
