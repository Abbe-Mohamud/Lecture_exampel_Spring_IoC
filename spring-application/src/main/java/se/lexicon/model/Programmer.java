package se.lexicon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.service.RandomSalaryService;
import se.lexicon.service.SalaryService;

@Component
public class Programmer implements Employee {


    SalaryService salaryService;

    public Programmer() {
    }
    @Autowired
    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @Override
    public String getDescription() {
        return "I love to code";
    }

    @Override
    public int getSalary() {
        return salaryService.getSalary();
    }


}
