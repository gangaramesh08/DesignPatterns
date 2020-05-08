public class VisitorMoveImpl implements VisitorMove {
    @Override
    public void move(VisitorBook book) {
        System.out.println("Moving book to another table.");
    }

    @Override
    public void move(VisitorShape shapeObject) {
        System.out.println("Moving shape : "+ shapeObject.getShapeName());
    }
}
