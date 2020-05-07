public class TemplateNetOrder extends TemplateOrder {
    @Override
    public void doSelect() {
        System.out.println("Item selected through online app and added to cart.");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment done through netbanking or mobile banking");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to the address provided");
    }
}
