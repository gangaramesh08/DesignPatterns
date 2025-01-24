package visitor;

public class VisitorBorderImpl implements VisitorIBorder {
    @Override
    public void visit(VisitorShape shape) {
        System.out.println("Adding border. " + shape.getShapeName());
    }
}
