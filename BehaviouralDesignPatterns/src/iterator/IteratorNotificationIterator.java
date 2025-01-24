package iterator;

import java.util.List;

public class IteratorNotificationIterator implements IteratorInterface {
    List<IteratorNotification> notificationList;
    String[] arrayNotifications;
    String collectionType;
    int pos = 0;
    int MAX_lENGTH;

    public IteratorNotificationIterator(List<IteratorNotification> notificationList) {
        this.notificationList = notificationList;
        this.collectionType = "List";
        MAX_lENGTH = notificationList.size();
    }

    public IteratorNotificationIterator(String[] arrayNotifications) {
        this.arrayNotifications = arrayNotifications;
        MAX_lENGTH = arrayNotifications.length;
        this.collectionType = "Array";
    }

    @Override
    public boolean hasNext() {
        return (pos < MAX_lENGTH);
    }

    @Override
    public Object next() {
        String value;
        if (collectionType.equalsIgnoreCase("List")) {
            value = notificationList.get(pos).getNotification();
        } else {
            value = arrayNotifications[pos];
        }
        pos++;
        return value;
    }
}
