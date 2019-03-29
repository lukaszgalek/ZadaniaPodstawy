package ZadanieCzwarte;

public class Podatek {
    private double podatek;
    private double nadwyzkaDochodu;
    private Uzytkownik uzytkownik;

    public double obliczPodatek(Uzytkownik uzytkownik) {
        if (uzytkownik.getDochod() <= 85528) {
            podatek = ((uzytkownik.getDochod() * 0.18) - 556.02);
            return podatek;
        } else {
            nadwyzkaDochodu = uzytkownik.getDochod() - 85528;
            podatek = 14839.02 + (nadwyzkaDochodu * 0.32);
            return podatek;

        }
    }
}
