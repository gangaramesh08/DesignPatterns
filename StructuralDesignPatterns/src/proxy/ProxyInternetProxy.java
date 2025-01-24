package proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternetProxy implements ProxyInternet {


    Set<String> bannedSites = new HashSet<>();
    private static ProxyRealInternet realInternet = null;
    public ProxyInternetProxy() {
        bannedSites.add("www.fakeIP.com");
        bannedSites.add("www.abc.com");
        bannedSites.add("www.def.com");
        if(null==realInternet){
            realInternet = new ProxyRealInternet();
        }
    }

    @Override
    public void connectTo(String url) {
        if(bannedSites.contains(url)){
            System.out.println("Cannot connect to the url :  "+url+" Banned!!!");
        }
        else
            realInternet.connectTo(url);
    }
}
