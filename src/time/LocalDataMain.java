package time;
import java.time.LocalDate;

public class LocalDataMain {
    public static void main(String[] args){
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,22);

        System.out.println(ofDate);
        System.out.println(nowDate);

        //계산(불변)
        LocalDate localDate = ofDate.plusDays(10);
        System.out.println("지정날짜 + 10d " + localDate);
    }
}
