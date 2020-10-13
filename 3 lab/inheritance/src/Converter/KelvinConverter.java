package Converter;

public class KelvinConverter extends BaseConverter {
    public KelvinConverter(double degrees) {
        super(degrees);
    }


    @Override
    public double convert() {
        System.out.println("Kelvin's scale");
        return (degreesCelsius + 273.15);
    }

}
