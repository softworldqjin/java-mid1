package lang.wrapper;

public class MyIntegerMain1 {
    public static void main(String[] args){
        MyInteger[] myIntegers = {new MyInteger(10), new MyInteger(20), new MyInteger(30)};

        System.out.println(findValue(myIntegers, 10));
        System.out.println(findValue(myIntegers, 20));
        System.out.println(findValue(myIntegers, 30));
        System.out.println(findValue(myIntegers, 40));

    }
    private static MyInteger findValue(MyInteger[] myInteger, int target){
        for (MyInteger myInteger1 : myInteger){
            if (myInteger1.getValue() == target){
                return myInteger1;
            }
        }
        return null;
    }
}
