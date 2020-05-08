public class VisitorDemo {
    public static void main(String[] args) {
        VisitorIBorder border = new VisitorBorderImpl();
        VisitorShape circle = new VisitorCircle();
        VisitorShape square = new VisitorSquare();
        circle.display();
        circle.accept(border);
        square.display();
        square.accept(border);

        VisitorMove moveObject = new VisitorMoveImpl();
        VisitorBook book = new VisitorBook("Tinkle");
        book.enableMove(moveObject);
        circle.enableMove(moveObject);
    }
}
