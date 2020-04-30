public class ALegacyImpl implements ALegacyInterface {
    private int id;
    private String firstName;

    public ALegacyImpl(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String toString() {
        return "ID : "+id+"Name : "+firstName;
    }
}
