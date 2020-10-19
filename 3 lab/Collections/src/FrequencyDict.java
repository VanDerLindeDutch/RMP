import java.util.HashMap;
import java.util.List;
import java.util.Map;
import WR.*;

public class FrequencyDict {
    Map<String, Integer> dict;
    String file;

    public FrequencyDict(String path) {
        dict = new HashMap<>();
        file = new File_Reader(path).getString().toString();

    }

    public Map<String, Integer> getDict(){
        String[] strings= file.split(" ");
        for(String i:strings){
            if(dict.containsKey(i)){
                int j = (int)(dict.get(i));
                j++;
                dict.put(i,j);
            }
            else {
                dict.put(i, 1);
            }
        }
        return dict;

    }
}
