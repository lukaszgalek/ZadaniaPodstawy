package ZadanieTrzecie;

import ZadanieCzwarte.Podatek;

public class BMI {
    private Person person;
    private double bmi;



    public double calculateBmi(Person person) {
        return bmi = (person.getWeight() / (person.getHeight() * person.getHeight()));
    }

    public String checkBmi(Person person){
        if(bmi>=18.5 && bmi<=24.90){
            return " prawidłowe";
        }else if (bmi<18.5){
            return " niedowaga";
        }else return " nadwaga";
    }}
