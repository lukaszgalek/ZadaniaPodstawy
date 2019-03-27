package ZadanieTrzecie;

public class Person implements Health {
    private double height;
    private double weight;
    private double bmi;

    public Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double bmi() {
        return bmi = (weight / (height * height));
    }

    public String checkBmi(){
        if(bmi>=18.5 && bmi<=24.90){
            return " prawidłowe";
        }else if (bmi<18.5){
            return " niedowaga";
        }else return " nadwaga";
    }
}
