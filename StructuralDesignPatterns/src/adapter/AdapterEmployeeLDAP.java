package adapter;

public class AdapterEmployeeLDAP {
    int cn;
    String givenName;
    String surname;
    String mailId;

    public AdapterEmployeeLDAP(int cn, String givenName, String surname, String mailId) {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mailId = mailId;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
}
