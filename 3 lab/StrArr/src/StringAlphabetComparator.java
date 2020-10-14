import java.util.Comparator;

public class StringAlphabetComparator<T extends Comparable> implements Comparator<T> {

    @Override
    public int compare(T a, T b)
    {
        return a.compareTo(b);
    }
}
