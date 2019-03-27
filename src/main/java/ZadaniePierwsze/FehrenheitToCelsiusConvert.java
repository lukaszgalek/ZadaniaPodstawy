package ZadaniePierwsze;

public class FehrenheitToCelsiusConvert implements ConverterTemperature {
    @Override
    public double ConvertTemperature(double c) {
        return ((c-32)/1.8);
    }
}
