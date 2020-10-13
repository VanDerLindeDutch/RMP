package Second;

public class KelvinConverter extends BaseConverter {
    public KelvinConverter(double degrees) {
        super(degrees);
    }

    public double convert() {
        return(degreesCelsius + 273.15);
    }

}
