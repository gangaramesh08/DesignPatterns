package visitor;

public class VisitorBook implements VisitorEnableMove  {
    String bookName;
    public VisitorBook(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void enableMove(VisitorMove moveObject) {
        moveObject.move(this);
    }
}
