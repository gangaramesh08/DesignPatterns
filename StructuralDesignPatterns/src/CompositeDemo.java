public class CompositeDemo {
    public static void main(String[] args) {
        CBox firstBox = new CBox("Box1",1000);
        CProduct phone = new CProduct("iPhone",60000);
        firstBox.addComponent(phone);

        CProduct watch = new CProduct("Fossil",9000);
        firstBox.addComponent(watch);

        CBox secondBox = new CBox("Box2",1000);
        CProduct glass = new CProduct("Glass",2000);
        secondBox.addComponent(glass);

        CProduct bottle = new CProduct("Bottle",3000);
        secondBox.addComponent(bottle);

        firstBox.addComponent(secondBox);

        System.out.println(firstBox.CalcPrice());

    }
}
