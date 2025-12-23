package lang.immutable.address.change;

public class ChangeMain {
    public static void main(String[] args){
        MutableObj mutableObj = new MutableObj(10);
        mutableObj.add(20);
        System.out.println(mutableObj.getValue());
        System.out.println(mutableObj);

        System.out.println();

        ImmutableObj immutableObj = new ImmutableObj(30);
        System.out.println(immutableObj);

        ImmutableObj immutableObj1 = immutableObj.add(100);
        System.out.println(immutableObj1);

        System.out.println(immutableObj.getValue());
        System.out.println(immutableObj1.getValue());

    }
}
