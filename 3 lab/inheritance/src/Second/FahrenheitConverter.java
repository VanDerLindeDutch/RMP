package Second;

public class FahrenheitConverter extends BaseConverter {
    public FahrenheitConverter(double degrees) {
        super(degrees);
    }

    public double convert() {
        return(degreesCelsius * 1.8 + 32);
    }
}
