import java.util.Arrays;

public class Inverting {
    public static StringBuilder invert(String str){
        String[] strings = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String j:strings){
            char[] chars = j.toCharArray();

            for(int i=0;i<chars.length/2;i++){
                char temp = chars[i];
                chars[i] = chars[chars.length-i-1];
                chars[chars.length-i-1] = temp;
            }
            stringBuilder.append(chars).append(" ");
        }
        return stringBuilder;
    }

}
