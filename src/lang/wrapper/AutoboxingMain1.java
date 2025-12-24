package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args){
        int value = 10;

//        Integer integer = Integer.valueOf(value);
        Integer integer = value; // 오토 박싱

//        int value1 = integer.intValue();
        int value1 = integer; // 오토 언박싱

        System.out.println(integer);
        System.out.println(value1);
    }
}
