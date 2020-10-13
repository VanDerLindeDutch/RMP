import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(2.4);
        Pyramid pyramid = new Pyramid(1.4,2.3,4.5);
        Cylinder cylinder = new Cylinder(1.2,34.5,3.1,2.9);
        Cylinder cylinder1 = new Cylinder(2.2,34.5,3.1,2.9);
        Box box = new Box(3);
        box.add(shape);
        box.add(pyramid);
        box.add(cylinder);
        box.add(cylinder1);
        System.out.println(box);
    }
}
