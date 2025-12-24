package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args){
        ValueAdder valueAdder = new ValueAdder();
//        valueAdder.add(1);
//        valueAdder.add(2);
//        valueAdder.add(3);
//
//        System.out.println(valueAdder.getValue());
//
        ValueAdder valueAdder1 = valueAdder.add(1);
        ValueAdder valueAdder2 = valueAdder1.add(2);
        ValueAdder valueAdder3 = valueAdder2.add(3);

        System.out.println(valueAdder);
        System.out.println(valueAdder1);
        System.out.println(valueAdder2);
        System.out.println(valueAdder3);

        System.out.println(valueAdder3.getValue());


    }
}
