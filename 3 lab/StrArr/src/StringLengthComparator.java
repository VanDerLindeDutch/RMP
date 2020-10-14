import java.util.Comparator;

public class StringLengthComparator<T extends String> implements Comparator<T> {
    @Override
    public int compare(T a, T b)
    {
        return (a.length() - b.length());
    }
}
