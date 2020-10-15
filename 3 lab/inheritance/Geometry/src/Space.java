import java.util.ArrayList;
import java.util.List;

public class Space<T extends Shape> {
    List<Shape> shapes;
    Space(List<Shape> shapes) {
        this.shapes = new ArrayList<>();
        this.shapes.addAll(shapes);
    }

    public double getTotalVolume()
    {
        double sum = 0;
        for(Shape i: shapes){
            sum += i.volume;
        }
        return sum;
    }
}



