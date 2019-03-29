package ZadanieTrzecie;

public class App {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        Person person = new Person(1.75, 58);

        System.out.println(" BMI jest równe " + bmi.calculateBmi(person));
        System.out.println(" co oznacza że BMI jest " + bmi.checkBmi(person));

        Person person1 = new Person(1.85, 60);
        System.out.println(" BMI jest równe " + bmi.calculateBmi(person1));
        System.out.println(" co oznacza że BMI jest " + bmi.checkBmi(person1));


    }
}
