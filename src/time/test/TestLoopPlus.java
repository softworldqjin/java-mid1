package time.test;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args){

        for (int i = 0; i < 5; i++){
            LocalDate date = LocalDate.of(2024,1,1).plusDays(i*14);
            System.out.println("날짜 " + (i+1) + ": " + date);
        }

        LocalDate date1 = LocalDate.of(2024,1,1);
        for (int i = 0; i < 5; i++){
            LocalDate newDate = date1.plus(2*i, ChronoUnit.WEEKS);
            System.out.println(newDate);
        }
    }
}
