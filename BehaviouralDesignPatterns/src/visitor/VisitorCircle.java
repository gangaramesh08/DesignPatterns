package visitor;

public class VisitorCircle implements VisitorShape{
    static String SHAPE = "Circle";

    @Override
    public String getShapeName() {
        return SHAPE;
    }

    @Override
    public void display() {
        System.out.println("Displaying Cricle");
    }

    @Override
    public void accept(VisitorIBorder border) {
        border.visit(this);
    }

    @Override
    public void enableMove(VisitorMove moveObject) {
        moveObject.move(this);
    }
}
