public class PughBillSingleton{
    private  PughBillSingleton(){

    }
    private static class Inner{
        public static final PughBillSingleton INSTANCE = new PughBillSingleton();
        static{
            System.out.println("Hello");
        }
    }
    public static PughBillSingleton getInstance(){

        return Inner.INSTANCE;
    }
}