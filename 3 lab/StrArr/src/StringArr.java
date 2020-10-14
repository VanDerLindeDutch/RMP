import java.util.List;

public abstract class StringArr {
    List<String> stringList;

    public StringArr(List<String> stringList) {
        this.stringList = stringList;
    }



    public abstract void sort();
}
