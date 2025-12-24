package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args){
        String str = "Apple,Banana,Orange";

        String[] strings = str.split(",");
        for (String string : strings) {
            System.out.println(string);
        }
        // 배열을 join 함수에
        String string = String.join("-", strings);
        System.out.println(string);

        // 문자를 join 함수에
        String string1 = String.join("-", "A","B","C");
        System.out.println(string1);
    }
}
