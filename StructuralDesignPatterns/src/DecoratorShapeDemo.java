public class DecoratorShapeDemo {
    public static void main(String[] args) {
        DecoratorShape circle = new DecoratorCircle();
        DecoratorShape square = new DecoratorSquare();
        DecoratorShape redSqaure = new RedDecorator(new DecoratorSquare());
        circle.draw();
        square.draw();
        redSqaure.draw();

    }
}
