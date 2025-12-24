package lang.string.Test;

public class TestString10 {
    public static void main(String[] args){
        String fruits = "apple,banana,mango";

        String[] strings = fruits.split(",");
        String string = String.join("->", strings);

        for (String s : strings){
            System.out.println(s);
        }
        System.out.println(string);
    }
}
