public class BuilderDemo {
    public static void main(String[] args) {
        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        BuilderPattern patternInstance = builder.bread("Wheat").condiments("Lettuce").meat("Ham").build();
        System.out.println(patternInstance.getBread());
        System.out.println(patternInstance.getDressing());
        System.out.println(patternInstance.getCondiments());
        StringBuilder sb = new StringBuilder();
    }
}
