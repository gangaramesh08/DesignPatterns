import java.util.ArrayList;
import java.util.List;

public class CBox implements Component{
    String name;
    double price;
    double sum=0;

    List<Component> componentList = new ArrayList<>();

    public CBox(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Component addComponent(Component component){
        componentList.add(component);
        return component;
    }

    public Component removeComponent(Component component){
        componentList.remove(component);
        return component;
    }
    @Override
    public double CalcPrice() {
        for(Component component : componentList){
            sum += component.CalcPrice();
        }
        return sum+price;
    }
}
