package lang.string.bulider;

public class StringBuilderMain2 {
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append("A").append("B").append("C").append("D")
                        .insert(4, 8)
                        .delete(4, 8)
                        .reverse()
                        .toString();


        System.out.println(stringBuilder);

        System.out.println(string);
    }
}
