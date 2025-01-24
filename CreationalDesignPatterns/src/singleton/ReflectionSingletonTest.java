package singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest{
    public static void main(String args[]){
        SingletonEarlySingleton instanceOne = SingletonEarlySingleton.getInstance();
        System.out.println(instanceOne.hashCode());
        SingletonEarlySingleton instanceTwo = null;
        try {
            Constructor constructors[] = SingletonEarlySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (SingletonEarlySingleton) constructor.newInstance();
            }
        } catch (Exception e){
            System.out.println("Runtime Exception");
        }
        System.out.println(instanceTwo.hashCode());
        System.out.println();
    }
}