package visitor;

public interface VisitorShape extends VisitorAccept,VisitorEnableMove{
    void display();
    String getShapeName();
}
