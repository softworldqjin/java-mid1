package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args){
        int num = 100;
        boolean bool = true;
        Object object = new Object();
        String str = "Hello, Java";

        // valueOf 메서드
        String numString = String.valueOf(num);
        String boolString = String.valueOf(bool);
        String objString = String.valueOf(object);

        System.out.println(numString);
        System.out.println(boolString);
        System.out.println(objString);

        // 문자 + 숫자 --> 문자
        String numString2 = " " + num;
        System.out.println(numString2);

        // toCharArray 메서드, 배열로 가져옴
        char[] strCharArray = String.valueOf(num).toCharArray();
        for (char c : strCharArray) {
            System.out.println(c);
        }


    }
}
