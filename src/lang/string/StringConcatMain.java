package lang.string;

public class StringConcatMain {
    public static void main(String[] args){
        String str1 = "hello";  // str1 == 0xx1
        String str2 = " world"; // str2 == 0xx2
                                // 0xx1 + 0xx2 사실상 불가능이지만, 자주 써서 허용됨

        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

    }
}
