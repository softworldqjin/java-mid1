package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args){
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2011,1,2,11,12,30);

        System.out.println(nowDt);
        System.out.println(ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println(ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println(ofDtPlus1Year);

        // 비교
        System.out.println(nowDt.isBefore(ofDt));
        System.out.println(nowDt.isAfter(ofDt));


    }
}
