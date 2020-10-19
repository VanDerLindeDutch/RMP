import java.util.Collection;
import java.util.HashSet;

public class DropDuplicate {
    public static<T> Collection<T> drop(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
