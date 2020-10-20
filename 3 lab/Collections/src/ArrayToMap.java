import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
    public static<T> Map<T, Integer> arrayToMap(T[] arr){
        HashMap<T, Integer> hashMap = new HashMap<>();
        for(T i:arr){
            if(!hashMap.containsKey(i)){
                hashMap.put(i, 1);
            }
            else {
                int j = hashMap.get(i);
                j++;
                hashMap.put(i,j);
            }
        }
        return hashMap;
    }
}
