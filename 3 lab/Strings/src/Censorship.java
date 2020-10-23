import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Censorship {

    public static String censor(String str){
        Pattern pattern = Pattern.compile("бяка");
        Matcher matcher = pattern.matcher(str);


        return matcher.replaceAll("цензура");
    }
}
