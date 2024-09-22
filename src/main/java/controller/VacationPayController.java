package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.VacationRequest;
import service.VacationPayService;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/calculate")
public class VacationPayController {

    private VacationPayService vacationPayService;

    public VacationPayController(VacationPayService vacationPayService) {
        this.vacationPayService = vacationPayService;
    }

    @GetMapping
    public double calculate(@RequestParam double averageSalary, @RequestParam int vacationDays,
                            @RequestParam LocalDate vacationDate) {

        VacationRequest request = new VacationRequest(averageSalary, vacationDays, vacationDate);
        return vacationPayService.calculatePay(request);
    }

}
