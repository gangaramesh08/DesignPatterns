public class IteratorDemo {
    public static void main(String[] args) {
        IteratorNotificationCollection notificationCollection = new IteratorNotificationCollection();
        notificationCollection.printNotifications();
        IteratorArrayNotificationCollection mapNotificationCollection = new IteratorArrayNotificationCollection();
        mapNotificationCollection.printNotifications();
    }
}
