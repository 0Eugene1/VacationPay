package service;

import org.springframework.stereotype.Service;
import repository.VacationRequest;

import java.time.LocalDate;

@Service
public class VacationPayService {
    private HolidayDays holidayDays;

    public VacationPayService() {
        holidayDays = new HolidayDays();
    }
    public double calculatePay(VacationRequest vacationRequest) {

        LocalDate startDate = vacationRequest.getStartVacationDate();
        int totalDays = vacationRequest.getVacationDays();
        double dailyRate = vacationRequest.getAverageSalary() / 30;


        int actualVacationDays = 0;

        for (int i = 0; i < totalDays; i++) {
            LocalDate currentDate = startDate.plusDays(i); // Текущая дата отпуска
            if (!holidayDays.isHoliday(currentDate)) {
                actualVacationDays++;
            }
        }
        double vacationPays = dailyRate * actualVacationDays;
        return dailyRate * actualVacationDays;
    }
}
