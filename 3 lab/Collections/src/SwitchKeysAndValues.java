import java.util.*;

public class SwitchKeysAndValues {
    public static <K, V> Map<V, List<K>> switchKandV(Map<K, V> map) {
        HashMap<V, List<K>> newMap = new HashMap<>();
        for (Map.Entry i : map.entrySet()) {
            if (!newMap.containsKey(i.getValue())) {
                newMap.put((V) i.getValue(), new ArrayList<K>((Collection<? extends K>) Arrays.asList(i.getKey())));
            } else {
                List<K> list = newMap.get(i.getValue());
                list.add((K) i.getKey());
                newMap.put((V) i.getValue(), list);
            }
        }
        return newMap;
    }
}
