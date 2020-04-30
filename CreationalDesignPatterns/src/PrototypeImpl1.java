public class PrototypeImpl1 implements PrototypeInterface{
    String name;
    int age;

    public PrototypeImpl1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PrototypeImpl1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public PrototypeInterface clone() throws CloneNotSupportedException {
        return (PrototypeImpl1)super.clone();
    }
}
