package prototype;

public class PrototypeDemo {
    public static void main(String[] args)throws CloneNotSupportedException {
       /*PrototypePattern p1 = new PrototypePattern(21,"Ganga");
        PrototypePattern p2 = new PrototypePattern(p1.getVal(),p1.getName());
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        int arr1[] = {1,2,3,4,5};
        int arr2[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());*/
        PrototypePatternRegistry item = new PrototypePatternRegistry();
        PrototypeMovie prototypeMovie = (PrototypeMovie) item.createPattern("P2");
        prototypeMovie.setTitle("Mayavi changed");
        System.out.println(prototypeMovie);
        System.out.println(prototypeMovie.getRuntime());
        System.out.println(prototypeMovie.getPrice());
        System.out.println(prototypeMovie.getTitle());

        PrototypeMovie another = (PrototypeMovie)item.createPattern("P2");
        another.setTitle("Another");
        System.out.println(another);
        System.out.println(another.getRuntime());
        System.out.println(another.getPrice());
        System.out.println(another.getTitle());

    }
}
