public class AdapterEmployeeInterfaceImpl implements AdapterEmployeeInterface {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public AdapterEmployeeInterfaceImpl(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
