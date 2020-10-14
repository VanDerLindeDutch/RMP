

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
        System.out.println(box);
        box.sort();
        System.out.println(box);

//        SolidOfRevolution SOR = new SolidOfRevolution(2, 1, (x) -> x * x - 16);
//        System.out.println(SOR.calculateVolume());


    }
}
