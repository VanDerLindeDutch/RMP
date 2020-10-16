import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FrequencyDict fDict = new FrequencyDict("o.txt");
        for(Map.Entry<String, Integer> i: fDict.getDict().entrySet()){
            System.out.print(i + "\n");
        }

    }
}
