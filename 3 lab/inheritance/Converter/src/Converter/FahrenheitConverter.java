package Converter;

public class FahrenheitConverter extends BaseConverter {
    public FahrenheitConverter(double degrees) {
        super(degrees);
    }


    @Override
    public double convert() {
        System.out.println("Fahrenheit's scale");
        return (degreesCelsius * 1.8 + 32);
    }
}
