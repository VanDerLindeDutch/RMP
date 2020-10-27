import com.google.gson.*;
import WR.*;
import com.google.gson.reflect.TypeToken;

import javax.tools.JavaFileObject;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("Enter what you want to find");
        Scanner in = new Scanner(System.in);
        String req = in.nextLine();
        in.close();
        String http = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\""+req+"\"";
        JsonObject JO = new GetJson(GetUrl.getUrl(http)).getJson();
        WikiJsonParser parser = new WikiJsonParser(JO);
        JsonArray jsonElements =  parser.getArrayInfo();
        WikiJsonParser.FormatedOutput(jsonElements);
        new File_Writer<JsonArray>("j.json").writeString(jsonElements, false);
    }
}
