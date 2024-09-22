package repository;

import java.time.LocalDate;
import java.util.Date;

public class VacationRequest {

    private double averageSalary;  //Better to use BigDecimal for it...
    private int vacationDays;
    private LocalDate startVacationDate;

    public VacationRequest(double averageSalary, int vacationDays, LocalDate startVacationDate) {
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
        this.startVacationDate = startVacationDate;
    }

    public LocalDate getStartVacationDate() {
        return startVacationDate;
    }

    public void setStartVacationDate(LocalDate startVacationDate) {
        this.startVacationDate = startVacationDate;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(int averageSalary) {
        this.averageSalary = averageSalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
