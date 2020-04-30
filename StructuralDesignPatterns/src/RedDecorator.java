public class RedDecorator extends DecoratorForShape {
    private DecoratorShape shape;
    public RedDecorator(DecoratorShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Applying red color to the shape added");

    }
}
