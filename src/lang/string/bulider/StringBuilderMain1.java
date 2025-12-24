package lang.string.bulider;

public class StringBuilderMain1 {
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");
        stringBuilder.append("F");
        System.out.println(stringBuilder);

        stringBuilder.insert(5, "Java");
        System.out.println("insert = " + stringBuilder);

        stringBuilder.delete(5,9);
        System.out.println(stringBuilder);

        String string = stringBuilder.toString();
        System.out.println(string);
    }
}
