public class ObserverSubscriber2 implements ObserverISubscriber {
    String name;

    public ObserverSubscriber2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void sendNotification(String bookName) {
        System.out.println(bookName +" is now available. Place your order now.!!!");
    }
}
