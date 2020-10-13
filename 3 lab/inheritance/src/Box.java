import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box extends Shape {
    Shape[] ShapesArr;
    private int i;

    public Box(int a)
    {
        ShapesArr = new Shape[a];
        i = 0;
    }

    public void add(Shape shape)
    {
        try {
            ShapesArr[i] = shape;
            i++;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "ShapesArr=" + Arrays.toString(ShapesArr) +
                '}';
    }
}
