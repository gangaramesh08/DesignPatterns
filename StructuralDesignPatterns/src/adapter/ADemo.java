package adapter;

import java.util.ArrayList;
import java.util.List;

public class ADemo {
    public static void main(String[] args) {
        List<ALegacyInterface> legacyInterfaceList = new ArrayList<>();
        ALegacyInterface instance = new ALegacyImpl(1,"a");
        legacyInterfaceList.add(instance);
        ANewInterface instance2 = new ANewImpl(2,"b");
        legacyInterfaceList.add(new AAdapter(instance2));
        System.out.println(legacyInterfaceList);
    }
}
