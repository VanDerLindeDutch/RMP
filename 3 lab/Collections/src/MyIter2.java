import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIter2<T> implements Iterator<T> {
    private T[][] array;
    private int index1 = 0, index2 = 0;

    MyIter2(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index1 < array.length && index2 < array[index1].length;
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        if(index2==array[index1].length-1)
        {
            int buf = index2;
            index2 = 0;
            return (array[index1++][buf]);

        }
        else {
            return array[index1][index2++];
        }
    }
}
