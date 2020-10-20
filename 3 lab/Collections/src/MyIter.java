import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIter<T> implements Iterator<T> {
    private T[] array;
    private int index = 0;
    MyIter(T[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return (index<array.length);
    }

    @Override
    public T next() {
        System.out.println(index);
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return array[index++];
    }
}
