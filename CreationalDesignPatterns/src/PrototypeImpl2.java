public class PrototypeImpl2 implements PrototypeInterface{
    String title;
    int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PrototypeImpl2(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public PrototypeImpl2() {
    }

    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        return (PrototypeImpl2)super.clone();
    }
}
