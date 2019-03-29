package ZadaniePierwsze;

public class App {
    public static void main(String[] args) {
        ConverterTemperature convert1 = new CelsiusToFahrenheitConvert();
        System.out.println("100 stopni celsjusza to " + convert1.ConvertTemperature(100) + " stopni fahrenheita");

        ConverterTemperature convert2 = new FehrenheitToCelsiusConvert();
        System.out.println("100 stopni fahrenheita to " + convert2.ConvertTemperature(100) + " stopni celsjusza");

        ConverterTemperature convert3 = new KelvinToCelsiusConvert();
        System.out.println("100 stopni kelwina to " + convert3.ConvertTemperature(100) + " stopni celsjusza");

        ConverterTemperature convert4 = new CelsiusToKelvinConvert();
        System.out.println("100 stopni celsjusza to " + convert4.ConvertTemperature(100) + " stopnii kelwina");
    }
}
