package lang.string.Test;

public class TestString7 {
    public static void main(String[] args){
        String original = "      Hello Java       ";
        String string = original.strip();

        System.out.println("'" + string + "'");

    }
}
