package ZadanieCzwarte;

public class App {
    public static void main(String[] args){


        Uzytkownik janek = new Uzytkownik(10000);
        Uzytkownik krzysiek = new Uzytkownik(100000);
        Podatek podatek = new Podatek();
        System.out.println(podatek.obliczPodatek(janek));
        System.out.println(podatek.obliczPodatek(krzysiek));
    }
}
