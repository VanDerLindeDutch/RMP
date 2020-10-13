package First;

public class SolidOfRevolution extends Shape
{
    private double radius;

    public SolidOfRevolution(double radius)
    {
        this.radius = radius;
    }

    public SolidOfRevolution(double volume, double radius)
    {
        super(volume);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "SolidOfRevolution{" +
                "radius=" + radius +
                ", volume=" + volume +
                '}';
    }

    public double getRadius()
    {
        return radius;
    }
}
