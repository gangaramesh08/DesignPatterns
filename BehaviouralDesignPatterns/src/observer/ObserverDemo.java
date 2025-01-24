package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        ObserverPublisher publisher = new ObserverPublisher();
        ObserverISubscriber subscriber1 = new ObserverSubscriber1("Subscriber1");
        ObserverISubscriber subscriber2 = new ObserverSubscriber2("Subscriber2");
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.update("HarryPotter",true);
        publisher.unsubScribe(subscriber1);
        publisher.update("Manorama",false);
        publisher.update("Hindu",true);

    }
}
