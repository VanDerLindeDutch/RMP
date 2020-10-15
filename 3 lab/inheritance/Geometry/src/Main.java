import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid(1.4,2.3,4.5);
        Cylinder cylinder = new Cylinder(1.2,34.5,3.1,2.9);
        Cylinder cylinder1 = new Cylinder(2.2,34.5,3.1,2.9);
        Cylinder cylinder2 = new Cylinder(2.16,34.6,3.1,2.9);
        Box box = new Box(4);
        box.add(pyramid);
        box.add(cylinder);
        box.add(cylinder1);
        box.add(cylinder2);
        box.sort();
        System.out.println(box);
        //------------------------------------------------------------------------------------------------------
        Space<Shape> shapeSpace = new Space<>(Arrays.asList(cylinder,cylinder1, pyramid, cylinder2));
        System.out.println(shapeSpace.getTotalVolume());
        //-----------------------------------------------------------------------------------------------
        SolidOfRevolution SOR = new SolidOfRevolution(2, 1, (x) -> x * x - 16);
        System.out.println(SOR.calculateVolume());
        //--------------------------------------------------------------------------------------------------
        Max max = new Max(Arrays.asList(1,2,3,4,5,0,3,6));
        System.out.println(max.getMax());

    }
}
