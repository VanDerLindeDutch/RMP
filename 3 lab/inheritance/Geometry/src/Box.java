

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Box extends Shape {
    private List<Shape> shapeList;
    private double boxVolume, presentVolume;

    public Box(double a) {
        boxVolume = a;
        presentVolume = 0;
        shapeList = new ArrayList<>();
    }
    
    public void add(Shape shape) {
        if(presentVolume< shape.volume){
            shapeList.add(shape);
            presentVolume+=shape.volume;
        }
        else {
            System.out.println("Volume excedeed");
        }
    }

    public void sort() {

        Collections.sort(shapeList);

    }

    @Override
    public String toString() {
        return "Box{" +
                "shapeList=" + shapeList +
                '}';
    }
}
