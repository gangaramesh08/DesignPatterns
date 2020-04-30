public class BridgeDemo {
    public static void main(String[] args) {
        BridgeColor blue = new BridgeBlue();
        BridgeShape circle = new BridgeCircle(blue);
        circle.applyColor();

        BridgeColor green = new BridgeGreen();
        green.applyColor();

    }
}
