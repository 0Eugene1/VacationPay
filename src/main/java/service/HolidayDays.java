package service;

import java.time.LocalDate;
import java.util.*;

public class HolidayDays {

    private Set<LocalDate> holidays;

    public HolidayDays() {
        holidays = new HashSet<>();

        holidays.add(LocalDate.of(2024, 1, 1));
        holidays.add(LocalDate.of(2024, 1, 2));
        holidays.add(LocalDate.of(2024, 1, 3));
        holidays.add(LocalDate.of(2024, 1, 4));
        holidays.add(LocalDate.of(2024, 1, 5));
        holidays.add(LocalDate.of(2024, 1, 6));
        holidays.add(LocalDate.of(2024, 1, 7));
        holidays.add(LocalDate.of(2024, 1, 8));

        holidays.add(LocalDate.of(2024, 3, 23));
        holidays.add(LocalDate.of(2024, 4, 8));
        holidays.add(LocalDate.of(2024, 6, 1));
        holidays.add(LocalDate.of(2024, 6, 9));
        holidays.add(LocalDate.of(2024, 7, 12));
        holidays.add(LocalDate.of(2024, 11, 4));
    }

    public boolean isHoliday(LocalDate date) {
        return holidays.contains(date);
    }
}
