package test;

import org.junit.Before;
import org.junit.Test;
import repository.VacationRequest;
import service.VacationPayService;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class VacationTest {

    private VacationPayService vacationPayService;

    @Before
    public void set() {
        vacationPayService = new VacationPayService();
    }

    @Test
    public void testCalculating() {
        VacationRequest vacationRequest = new VacationRequest(25000, 20, LocalDate.of(2024, 3, 5));
        double expected = 833.3;
        double actual = vacationPayService.calculatePay(vacationRequest);

        assertEquals(expected, actual, 0.1);

    }
}
