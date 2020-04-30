public class ANewImpl implements ANewInterface {
    private int cn;
    private String givenName;

    public ANewImpl(int cn, String givenName) {
        this.cn = cn;
        this.givenName = givenName;
    }

    @Override
    public int getCn() {
        return cn;
    }

    @Override
    public String getGivenName() {
        return givenName;
    }
}
