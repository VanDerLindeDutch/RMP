package Converter;

public abstract class BaseConverter {
    protected double degreesCelsius;

    public BaseConverter(double degrees) {
        this.degreesCelsius = degrees;
    }

    public abstract double convert();
}
