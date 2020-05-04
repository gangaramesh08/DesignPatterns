public class IteratorArrayNotificationCollection implements IteratorCollectionInterface {

    String[] arrayNotifications;
    IteratorInterface iterator;

    public IteratorArrayNotificationCollection() {

        this.arrayNotifications = new String[3];
        arrayNotifications[0] = "NotifyArray1";
        arrayNotifications[1] = "NotifyArray2";
        arrayNotifications[2] = "NotifyArray3";
    }

    public void printNotifications() {
        this.iterator = iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public IteratorInterface iterator() {

        return new IteratorNotificationIterator(arrayNotifications);
    }
}
