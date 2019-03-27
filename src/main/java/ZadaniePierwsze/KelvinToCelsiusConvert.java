package ZadaniePierwsze;

public class KelvinToCelsiusConvert implements ConverterTemperature {
    @Override
    public double ConvertTemperature(double c) {
        return c+273;
    }
}
