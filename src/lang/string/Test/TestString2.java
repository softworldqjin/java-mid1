package lang.string.Test;

public class TestString2 {
    public static void main(String[] args){
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String a : arr){
            sum += a.length();
            String str = String.format("%s : %d", a, a.length());
            System.out.println(str);
        }
        System.out.println("sum = " + sum);
    }
}
