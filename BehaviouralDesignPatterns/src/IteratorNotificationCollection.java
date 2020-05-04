import javax.management.Notification;
import java.util.ArrayList;
import java.util.List;

public class IteratorNotificationCollection implements IteratorCollectionInterface {
    List<IteratorNotification> notificationList;

    public IteratorNotificationCollection() {
        notificationList = new ArrayList<>();
        notificationList.add(new IteratorNotification("Notification 1"));
        notificationList.add(new IteratorNotification("Notification 2"));
        notificationList.add(new IteratorNotification("Notification 3"));
    }

    public void printNotifications() {
        IteratorInterface iterator = iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


        }

    }

    @Override
    public IteratorInterface iterator() {
        return new IteratorNotificationIterator(notificationList);
    }
}
