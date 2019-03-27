package ZadanieTrzecie;

public class App {
    public static void main(String[] args){

Person person = new Person( 1.75, 58);

        System.out.println(" BMI jest równe " + person.bmi());
        System.out.println(" co oznacza że BMI jest " + person.checkBmi());

    }
}
