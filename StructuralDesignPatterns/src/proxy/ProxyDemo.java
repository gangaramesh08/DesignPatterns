package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        ProxyInternet proxy = new ProxyInternetProxy();
        proxy.connectTo("www.google.com");
        proxy.connectTo("www.fakeIP.com");

    }
}
