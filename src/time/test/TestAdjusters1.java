package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters1 {
    public static void main(String[] args){
        int year = 2024;
        int month = 1;

        // 로컬데이트로 몇월 며칠 생성
        LocalDate first = LocalDate.of(year, month, 1);
        // 그 몇월에 첫날로 설정
        // 요일 뽑기
        DayOfWeek dayOfWeek = first.getDayOfWeek();

        System.out.println("first day: " + dayOfWeek);

        // 그 몇월의 마지막날 설정
        int lastDay = first.lengthOfMonth();
        System.out.println(lastDay);

        // 요일뽑기
        LocalDate last = LocalDate.of(year, month, lastDay);
        DayOfWeek dayOfWeek1 = last.getDayOfWeek();

        System.out.println("last day: " + dayOfWeek1);
    }
}
