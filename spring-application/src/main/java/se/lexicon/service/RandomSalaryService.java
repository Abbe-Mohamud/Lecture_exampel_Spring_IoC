package se.lexicon.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomSalaryService implements SalaryService{



    @Override
    public int getSalary() {
        return new Random().nextInt(55000) + 25000;
    }
}
