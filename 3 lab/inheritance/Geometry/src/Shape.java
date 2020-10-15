
public abstract class Shape implements Comparable<Shape>{
    protected double volume;

    public Shape() {
    }

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Shape shape) {
        return (int)(Math.signum(volume - shape.volume));
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                '}';
    }
}
