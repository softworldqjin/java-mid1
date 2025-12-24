package lang.string.Test;

public class TestString11 {
    public static void main(String[] args){
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder(str);
        String string = sb.reverse().toString();

        System.out.println(string);
    }
}
