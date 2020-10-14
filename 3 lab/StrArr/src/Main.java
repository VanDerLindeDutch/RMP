import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringArr stringArr = new StringArr(Arrays.asList("ss", "qweqw", "qewqwesd"));
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Input a string, press enter if you want to leave");
            String string = in.nextLine();
            if(string.equals(""))
            {
                break;
            }
            stringArr.add(string);

        }
        in.close();
        Comparator<String> comp = new StringAlphabetComparator().thenComparing(new StringAlphabetComparator());
        stringArr.sort(comp);
        System.out.println(stringArr);


    }
}
