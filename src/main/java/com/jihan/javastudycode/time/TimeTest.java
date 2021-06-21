package com.jihan.javastudycode.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Map;

import static java.time.DayOfWeek.*;
import static java.time.temporal.ChronoUnit.*;
import static java.time.temporal.TemporalAdjusters.*;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

        LocalDate bDate = LocalDate.of(1992, 3, 2);
        LocalTime bTime = LocalTime.of(7, 15, 30);
        LocalDateTime birthday = LocalDateTime.of(bDate, bTime);
        ZonedDateTime zBirthday = ZonedDateTime.of(birthday, ZoneId.of("Asia/Seoul"));
        System.out.println(birthday);
        System.out.println(zBirthday);

        int minute = bTime.getMinute();
        int minute2 = bTime.get(ChronoField.MINUTE_OF_HOUR);

        System.out.println(minute);
        System.out.println(minute2);

        LocalDate tomorrow = date.plusDays(1);
        LocalDate tomorrow2 = date.plus(1, DAYS);
        System.out.println(tomorrow);
        System.out.println(tomorrow2);

        LocalDate parseBirthday = LocalDate.parse("1992-03-02");
        System.out.println(parseBirthday);

        System.out.println(bDate.withYear(2021));
        System.out.println(bTime.withHour(22));
        System.out.println(bDate.plusDays(1));
        System.out.println(bDate.minusYears(3));
        System.out.println(bTime.truncatedTo(HOURS));

        bDate = birthday.toLocalDate();
        bTime = birthday.toLocalTime();

        System.out.println(bDate);
        System.out.println(bTime);

        ZonedDateTime zonedDT = birthday.atZone(ZoneId.of("America/New_York"));
        System.out.println(zonedDT);

        System.out.println(ZonedDateTime.now((ZoneId.of("America/New_York"))));

        LocalDate nextMonday = date.with(next(MONDAY));
        LocalDate lastDayOfMonth = date.with(lastDayOfMonth());
        System.out.println(lastDayOfMonth);
        System.out.println(nextMonday);
        System.out.println(previous(TUESDAY));

        Period pe = Period.between(date, bDate);
        System.out.println(pe);

        Duration du = Duration.between(time, bTime);
        System.out.println(du);

        long year = pe.get(YEARS);
        long month = pe.get(MONTHS);
        System.out.println(year);
        System.out.println(month);

        System.out.println(pe.getUnits());
        System.out.println(du.getUnits());
        boolean negative = pe.isNegative();
        System.out.println(negative);

        Period normalized = Period.of(1, 14, 32).normalized();
        System.out.println(normalized);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("2021-06-21 14:50:30", pattern);
        System.out.println(parse);
    }
}
