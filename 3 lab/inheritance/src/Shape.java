public class Shape {
    protected double volume;

    public Shape() {
    }

    public Shape(double volume) {
        this.volume = volume;
    }

    protected double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                '}';
    }
}
