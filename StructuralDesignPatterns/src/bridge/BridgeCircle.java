package bridge;

public class BridgeCircle implements BridgeShape {
    private int radius;
    private BridgeColor color;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public BridgeCircle(int radius) {
        this.radius = radius;
    }

    public BridgeCircle(BridgeColor color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return (2*3.14*radius*radius);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}
