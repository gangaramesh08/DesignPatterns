public class ProxyRealInternet implements ProxyInternet{
    @Override
    public void connectTo(String url) {
        System.out.println("Connected to the url : "+url);
    }
}
