import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vector vector = new Vector(2,2,2);
        Vector vector2 = new Vector(3,4,3);
        System.out.println(vector.Length());
        System.out.println(Vector.Skalar(vector, vector2));
        System.out.println(Vector.VecMul(vector, vector2));
        Vector[] vectors = Vector.ArrVect(5);

        for(Vector i : vectors)
        {
            System.out.println(i);
        }


    }
}
