package lang.wrapper;

public class MyIntegerMain0 {
    public static void main(String[] args){
        MyInteger myInteger = new MyInteger(10);
        int value = myInteger.compareTo(20);
        System.out.println(value);
        System.out.println(myInteger.toString());
    }
}
