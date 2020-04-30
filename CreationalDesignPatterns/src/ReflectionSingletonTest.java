import java.lang.reflect.Constructor;

public class ReflectionSingletonTest{
    public static void main(String args[]){
        EarlySingleton instanceOne = EarlySingleton.getInstance();
        System.out.println(instanceOne.hashCode());
        EarlySingleton instanceTwo = null;
        try {
            Constructor constructors[] = EarlySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EarlySingleton) constructor.newInstance();
            }
        } catch (Exception e){
            System.out.println("Runtime Exception");
        }
        System.out.println(instanceTwo.hashCode());
        System.out.println();
    }
}