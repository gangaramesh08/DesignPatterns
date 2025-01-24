package adapter;

public class AAdapter implements ALegacyInterface{
    private ANewInterface instance;

    public AAdapter(ANewInterface instance) {
        this.instance = instance;
    }

    @Override
    public int getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String toString() {
        return "ID : "+getId()+"Name : "+getFirstName();
    }
}
