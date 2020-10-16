import java.net.MalformedURLException;
import java.net.URL;

public class GetUrl {
    public static URL getUrl(String http) throws MalformedURLException {
        return(new URL(http));
    }
}
