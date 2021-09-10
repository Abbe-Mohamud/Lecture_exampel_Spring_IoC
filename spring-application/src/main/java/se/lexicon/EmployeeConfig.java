package se.lexicon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.model.Programmer;
import se.lexicon.model.SalesPerson;
import se.lexicon.service.RandomSalaryService;



@Configuration
public class EmployeeConfig {


    // Setter Injection with JAVA CODE
    @Bean
    public Programmer programmer(){
        Programmer programmer = new Programmer();
        programmer.setSalaryService(randomSalaryService());
        return programmer;
    }


    // Constructor Injection with JAVA CODE
    @Bean
    public SalesPerson salesPerson(){
        return new SalesPerson(randomSalaryService());
    }


    //Bean  - Service
    @Bean
    public RandomSalaryService randomSalaryService(){
        return new RandomSalaryService();
    }



}
