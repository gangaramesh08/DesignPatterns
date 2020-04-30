import java.util.HashMap;
import java.util.Map;

public class PrototypePatternRegistry {
    private Map<String,PrototypeItem> items = new HashMap<>();
    public PrototypePatternRegistry(){
        loadItems();
    }
    public PrototypeItem createPattern(String type){
        PrototypeItem prototypeItem = null;
        try{
            prototypeItem = (PrototypeItem)items.get(type).clone();
        }catch(CloneNotSupportedException exception){
            exception.printStackTrace();
        }
        return prototypeItem;
    }
    private void loadItems(){
        PrototypeBook book = new PrototypeBook();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Kalikudukka");
        items.put("P1",book);

        PrototypeMovie movie = new PrototypeMovie();
        movie.setRuntime("2 hours");
        movie.setTitle("Mayavi");
        movie.setPrice(35.5);
        items.put("P2",movie);
    }
}
