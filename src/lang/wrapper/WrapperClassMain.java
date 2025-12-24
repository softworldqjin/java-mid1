package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args){
        Integer newInteger = new Integer(10);
        Integer newInteger1 = Integer.valueOf(10);

        Long newLong = new Long(10);
        Double newDouble = new Double(10);

        System.out.println(newInteger);
        System.out.println(newLong);
        System.out.println(newDouble);

        int value = newInteger1.intValue();
        System.out.println(value);
        System.out.println(newInteger == newInteger1);
        System.out.println(newInteger.equals(newInteger1));
    }

}
