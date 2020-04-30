public class FactoryDemo {
    public static void main(String[] args) {
        FactoryConfig config = new FactoryConfig();
        FactoryInterface ins = config.getInstance("1");
        ins.display();
        ins = config.getInstance("2");
        ins.display();
    }
}
