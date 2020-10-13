public class Vector {
    private final int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double Length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static int Skalar(Vector a, Vector b) {
        return (a.x * b.x + a.y * b.y + a.z * b.z);
    }

    public static Vector VecMul(Vector a, Vector b) {
        return (new Vector(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x));
    }

    public static Vector Sum(Vector a, Vector b) {
        return (new Vector(a.x + b.x, a.y + b.y, a.z + b.z));
    }

    public static Vector div(Vector a, Vector b) {
        return (new Vector(a.x - b.x, a.y - b.y, a.z - b.z));
    }

    public static double cosAngle(Vector a, Vector b) {
        return (Skalar(a,b)/(a.Length()*b.Length()));
    }

    public static Vector[] ArrVect(int N)
    {
        Vector[] vectors = new Vector[N];
        for(int i = 0;i<N;i++)
        {
            vectors[i] = new Vector((int)(Math.random() * 10), (int)(Math.random()*10), (int)(Math.random()*10));
        }
        return vectors;
    }


    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
