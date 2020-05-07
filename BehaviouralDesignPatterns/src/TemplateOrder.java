public abstract class TemplateOrder {
    public abstract void doSelect();

    public abstract void doPayment();

    public final void giftWrap() {
        System.out.println("Item is gift wrapped.");
    }

    public abstract void doDelivery();

    public void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrap();
        }
        doDelivery();

    }
}
