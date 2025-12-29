package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args){
        LocalDate startDate = LocalDate.of(2024,1,1);
        LocalDate endDate = LocalDate.of(2024,11,21);

        Period between = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println(startDate);
        System.out.println(endDate);
        System.out.format("남은 기간: %d년 %d개월 %d일\n", between.getYears(), between.getMonths(),
                between.getDays());
        System.out.println("디데이: " + daysBetween);
    }
}
