package singleton;

public class SingletonEnumSingleton {

    public static void main(String[] args) {
        System.out.println(SingleObject.INSTANCE.getValue());
        System.out.println(SingleObject.INSTANCE.getValue());
        System.out.println(SingleObject.INSTANCE.getValue());
        System.out.println(SingleObject.INSTANCE.sum(10,5
        ));
    }

}





enum SingleObject{
    INSTANCE;

    SingleObject(){

    }

    public int getValue(){
        return INSTANCE.hashCode();
    }

    public int sum(int a, int b){
        return a + b;
    }
}