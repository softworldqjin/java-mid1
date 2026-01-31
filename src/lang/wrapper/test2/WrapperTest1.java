package lang.wrapper.test2;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int str1Int = Integer.parseInt(str1);
        int str2Int = Integer.parseInt(str2);

        System.out.println("두수의합: " + (str1Int + str2Int));
    }
}
