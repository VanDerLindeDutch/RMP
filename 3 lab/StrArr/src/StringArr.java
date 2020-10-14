import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringArr {
    List<String> stringList;

    public StringArr(List<String> stringList) {
        this.stringList = new ArrayList<String>();
        this.stringList.addAll(stringList);
    }

    public void add(String string) {
        stringList.add(string);
    }

    @Override
    public String toString() {
        return "StringArr{" +
                "stringList=" + stringList +
                '}';
    }

    public void sort(Comparator<String> comparator)
    {
        stringList.sort(comparator);
    }
}
