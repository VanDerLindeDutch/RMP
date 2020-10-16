import com.google.gson.*;
import WR.File_Writer;
import com.google.gson.reflect.TypeToken;

import javax.tools.JavaFileObject;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        String http = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"L\"";
        JsonObject JO = new GetJson(GetUrl.getUrl(http)).getJson();
        WikiJsonParser parser = new WikiJsonParser(JO);
        JsonArray jsonElements =  parser.getArrayInfo();
        WikiJsonParser.FormatedOutput(jsonElements);
        new File_Writer<JsonArray>("j.json").writeString(jsonElements, false);
    }
}
