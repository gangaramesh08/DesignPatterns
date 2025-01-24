package template;

public class TemplateDemo {
    public static void main(String[] args) {
        TemplateOrder netOrder = new TemplateNetOrder();
        netOrder.processOrder(true);

        TemplateOrder storeOrder = new TemplateStoreOrder();
        storeOrder.processOrder(false);
    }
}
