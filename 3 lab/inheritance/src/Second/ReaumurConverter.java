package Second;

public class ReaumurConverter extends BaseConverter
{
    public ReaumurConverter(double degrees) {
        super(degrees);
    }

    @Override
    public double convert() {
        System.out.println("Reaumur scale");
        return(degreesCelsius * 0.8);
    }
}
