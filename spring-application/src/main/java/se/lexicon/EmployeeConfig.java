package se.lexicon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.lexicon.model.Employee;
import se.lexicon.model.Programmer;
import se.lexicon.model.SalesPerson;

@Configuration
public class EmployeeConfig {


    @Bean
    public Employee programmer(){

        Programmer programmer = new Programmer();
        return programmer;
    }
    @Bean
    public Employee salesPerson(){
        return new SalesPerson();
    }

}
