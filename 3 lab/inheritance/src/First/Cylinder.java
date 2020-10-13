package First;

public class Cylinder  extends Pyramid
{
    private double height;

    public Cylinder(double s, double h, double height)
    {
        super(s, h);
        this.height = height;
    }

    public Cylinder(double height)
    {
        this.height = height;
    }

    public Cylinder(double volume, double s, double h, double height)
    {
        super(volume, s, h);
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Cylinder{" +
                "height=" + height +
                ", s=" + s +
                ", h=" + h +
                ", volume=" + volume +
                '}';
    }

    public double getHeight()
    {
        return height;
    }
}
