package lang.object.toString;

public class ObjectPrinter {
    public static void print(Object object){
        String string = "객체: " + object.toString();
        System.out.println(string);
    }
}
