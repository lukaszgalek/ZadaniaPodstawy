package ZadaniePierwsze;

public class CelsiusToKelvinConvert implements ConverterTemperature {
    @Override
    public double ConvertTemperature(double c) {
        return c-273;
    }
}
