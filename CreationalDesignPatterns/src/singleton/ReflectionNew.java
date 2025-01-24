package singleton;

import java.lang.reflect.Constructor;

class SingletonTest{
    private static volatile SingletonTest test = null;
    private SingletonTest(){
        if(test!=null){
            throw new RuntimeException("use getinstance method");
        }
    }
    public static SingletonTest getInstance(){
        if(null==test){
            synchronized (SingletonTest.class){
                if(null==test){
                    test = new SingletonTest();
                }
            }
        }
        return test;
    }
}
public class ReflectionNew {
    public static void main(String[] args) {
        SingletonTest test1 = SingletonTest.getInstance();
        System.out.println(test1.hashCode());
        SingletonTest test = null;
        try {
            Constructor constructors[] = SingletonTest.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                test = (SingletonTest) constructor.newInstance();
                System.out.println(test.hashCode());
                test = (SingletonTest)constructor.newInstance();
                System.out.println(test.hashCode());
            }
        } catch (Exception exception){
            System.out.println("Exception caught"+exception);
        }
       // System.out.println(test.hashCode());
    }
}
