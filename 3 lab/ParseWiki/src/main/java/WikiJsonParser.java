import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class WikiJsonParser {
    private JsonObject JO;

    public WikiJsonParser(JsonObject JO) {
        this.JO = JO;
    }

    public JsonArray getArrayInfo(){           //get array of found elements
        return JO.get("query").getAsJsonObject().get("search").getAsJsonArray();
    }

    public static void FormatedOutput(@org.jetbrains.annotations.NotNull JsonArray jsonArray){         // formated output of found elements
        int count = 0;
        for(JsonElement i:jsonArray){

            System.out.println("Element "+count+'\n' +
                     "title: " +i.getAsJsonObject().get("title") + '\n' +
                     "info: " + i.getAsJsonObject().get("snippet") + '\n');
            count++;
        }
    }
}
