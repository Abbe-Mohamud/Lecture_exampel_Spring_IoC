package se.lexicon.model;


import org.springframework.stereotype.Component;

@Component("programmer")
public class Programmer implements Employee {

    @Override
    public String getDescription() {
        return "I love to code";
    }
}
