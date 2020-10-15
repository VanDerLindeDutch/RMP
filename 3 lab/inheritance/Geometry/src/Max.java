import java.util.ArrayList;
import java.util.List;

public class Max<T extends Comparable>{
    List<T> list;
    Max(List<T> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    public T getMax(){
        T max = list.get(0);
        for(int i = 1;i<list.size();i++){
            if(max.compareTo(list.get(i))<0){
                max = list.get(i);
            }
        }
        return max;

    }
}
