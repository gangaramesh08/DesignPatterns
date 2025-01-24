package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverPublisher {
    String bookName;
    boolean isAvailable;
    Map<String, Boolean> bookMap = new HashMap<>();

    List<ObserverISubscriber> subscriberList = null;

    public ObserverPublisher() {
        subscriberList = new ArrayList<>();
        bookMap.put("HarryPotter", false);
        bookMap.put("Tinkle", false);
        bookMap.put("Balarama", false);
    }

    public ObserverPublisher(String bookName, boolean isAvailable) {
        this.bookName = bookName;
        this.isAvailable = isAvailable;
        bookMap.put(bookName, isAvailable);
    }

    public void subscribe(ObserverISubscriber subscriber) {
        System.out.println("Added new subscriber " + subscriber.getName());
        subscriberList.add(subscriber);
    }

    public void unsubScribe(ObserverISubscriber subscriber) {
        System.out.println(subscriber.getName() + " has unsubscribed");
        subscriberList.remove(subscriber);
    }

    public void publish(String bookName) {
        subscriberList.forEach(e -> {
            System.out.println("Sending notification to " + e.getName());
            if (bookMap.get(bookName)) {
                e.sendNotification(bookName);
            }
        });
    }

    public void update(String bookName, boolean isAvailable) {
        bookMap.put(bookName, isAvailable);
        publish(bookName);
    }
}
