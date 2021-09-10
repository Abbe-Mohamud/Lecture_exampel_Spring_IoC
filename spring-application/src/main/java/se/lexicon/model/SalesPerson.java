package se.lexicon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.service.SalaryService;


public class SalesPerson implements  Employee{

    SalaryService salaryService;


    public SalesPerson(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @Override
    public String getDescription() {
        return "I like to sell and contacts";

    }

    @Override
    public int getSalary() {

        return salaryService.getSalary();
    }


}

