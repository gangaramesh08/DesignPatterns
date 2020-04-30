public class AdapterLDAP implements AdapterEmployeeInterface {
    AdapterEmployeeLDAP instance;

    public AdapterLDAP(AdapterEmployeeLDAP instance){
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
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMailId();
    }
}
