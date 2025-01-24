package template;

public class TemplateStoreOrder extends TemplateOrder {
    @Override
    public void doSelect() {
        System.out.println("Customer choses the item from the shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment is done at the cash counter");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item is delivered at the collection counter in the store");
    }
}
