package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestAdjusters {
    public static void main(String[] args){
        int year = 2024;
        int month = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("월 입력: ");
        month = scanner.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = firstDay.getDayOfWeek();

        LocalDate lastDay = firstDay.with(TemporalAdjusters.lastDayOfMonth());
        DayOfWeek dayOfWeek1 = lastDay.getDayOfWeek();

        System.out.println("입력한 월의 첫 날 요일: " + dayOfWeek);
        System.out.println("입력한 월의 마지막 날 요일: " + dayOfWeek);


    }
}
