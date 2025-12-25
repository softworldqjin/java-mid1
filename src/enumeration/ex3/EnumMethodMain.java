package enumeration.ex3;
import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args){
        Grade[] values = Grade.values();
        System.out.println(Arrays.toString(values));

        System.out.println(values[0].name());
        System.out.println(values[1].name());
        System.out.println(values[2].name());

        Grade grade = Grade.valueOf("BASIC");
        System.out.println(grade);
    }
}
