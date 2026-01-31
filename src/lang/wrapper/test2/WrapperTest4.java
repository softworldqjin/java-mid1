package lang.wrapper.test2;

public class WrapperTest4 {
    public static void main(String[] args){
        String str = "100";

        int value = Integer.valueOf(str);
        Integer integer1 = value;
        int intValue = integer1;
        Integer integer2 = intValue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
