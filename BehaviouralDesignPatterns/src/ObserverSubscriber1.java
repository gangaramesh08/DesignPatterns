public class ObserverSubscriber1 implements ObserverISubscriber {
    String name;
    String age;

    public String getAge() {
        return age;
    }

    public ObserverSubscriber1(String name) {
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
