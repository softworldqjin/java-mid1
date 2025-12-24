package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args){
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java";

        // format 메서드
        String str1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(str1);

        String str2 = String.format("소수점 2번째: %.2f", 123.129);
        System.out.println(str2);

        // printf
        System.out.printf("소수점 3번째: %.3f", 123.45678);


    }
}
