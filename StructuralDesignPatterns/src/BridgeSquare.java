public class BridgeSquare implements BridgeShape {
    private int side;
    private BridgeColor color;

    public BridgeSquare(int side) {
        this.side = side;
    }

    public BridgeSquare(BridgeColor color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return (side*side);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}