package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestZone {
    public static void main(String[] args){

        ZonedDateTime seoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm::ss (z)");

        System.out.println("서울시간: " + seoul.format(formatter));
        System.out.println("런던시간: " + london.format(formatter));

    }
}
