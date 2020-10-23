public class FindOccurence {
    public static int find(String str, String str1){
        int count = 0, i = 0;
        while (i<str.length()){
            i = str.indexOf(str1, i);
            if(i!=-1){
                count++;
            }
            else {
                break;
            }
            i++;
        }
        return count;
    }
}
