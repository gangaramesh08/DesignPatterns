package prototype;

public class ProtoDemo {
    public static void main(String[] args) {
        ProtoRegistry registry = new ProtoRegistry();
        PrototypeInterface instance1 = registry.createItem("prototype.PrototypeImpl1");
        PrototypeInterface instance2 = registry.createItem("prototype.PrototypeImpl1");
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
