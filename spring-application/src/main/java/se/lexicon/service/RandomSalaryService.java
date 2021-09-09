package se.lexicon.service;

import java.util.Random;

public class RandomSalaryService implements SalaryService{



    @Override
    public int getSalary() {
        return new Random().nextInt(55000) + 25000;
    }
}
