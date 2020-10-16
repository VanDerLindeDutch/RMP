import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetJson {
    private URL url;

    public GetJson(URL url) {
        this.url = url;
    }

    public JsonObject getJson() throws NullPointerException{
        InputStreamReader inputStream = null;
        try {
            inputStream = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(inputStream==null) throw new NullPointerException("NULLLL");
        return (new Gson().fromJson(inputStream, JsonObject.class));
    }

}
