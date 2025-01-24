package prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoRegistry {
    public static final String IMPL1 = "prototype.PrototypeImpl1";
    public static final String IMPL2 = "prototype.PrototypeImpl2";
    public ProtoRegistry() {
        loadObjects();
    }
    private Map<String, PrototypeInterface> items = new HashMap<>();
    public PrototypeInterface createItem(String type){
        PrototypeInterface prototypeInterface=null;
        try {
            prototypeInterface = items.get(type).clone();
        }catch (CloneNotSupportedException exception){

        }
        return prototypeInterface;
    }

    private void loadObjects(){
        PrototypeImpl1 prototypeImpl1 = new PrototypeImpl1("Ganga",24);
        items.put(IMPL1,prototypeImpl1);
        PrototypeImpl2 prototypeImpl2 = new PrototypeImpl2();
        items.put(IMPL2,prototypeImpl2);
    }
}
