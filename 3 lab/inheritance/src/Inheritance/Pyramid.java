package Inheritance;

public class Pyramid extends Shape {
    protected double s, h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    public Pyramid() {
    }

    public Pyramid(double volume, double s, double h) {
        super(volume);
        this.s = s;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "s=" + s +
                ", h=" + h +
                ", volume=" + volume +
                '}';
    }
}
