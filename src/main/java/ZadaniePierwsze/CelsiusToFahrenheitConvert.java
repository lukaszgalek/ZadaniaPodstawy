package ZadaniePierwsze;

import ZadaniePierwsze.ConverterTemperature;

public class CelsiusToFahrenheitConvert implements ConverterTemperature {
    @Override
    public double ConvertTemperature(double c) {
        return ((c*1.8)+32);
    }
}
