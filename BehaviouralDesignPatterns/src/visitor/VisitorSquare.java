package visitor;

public class VisitorSquare implements VisitorShape {
    static String SHAPE = "Square";

    @Override
    public String getShapeName() {
        return SHAPE;
    }
    @Override
    public void display() {
        System.out.println("Displaying Square");
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
