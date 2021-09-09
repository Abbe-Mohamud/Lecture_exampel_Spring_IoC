package se.lexicon.model;

import se.lexicon.service.SalaryService;


public class SalesPerson implements  Employee{

    SalaryService salaryService;

    public SalesPerson() {
    }

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

