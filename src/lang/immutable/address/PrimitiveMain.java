package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args){
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getValue());
        System.out.println(b.getValue());

//        b.setValue("부산");
        b = new ImmutableAddress("서울");
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getValue());
        System.out.println(b.getValue());
    }
}
