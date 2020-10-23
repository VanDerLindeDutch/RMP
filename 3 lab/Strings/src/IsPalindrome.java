public class IsPalindrome {
    private char[] string;

    public IsPalindrome(String string) {
        this.string = string.toCharArray();
    }

    public boolean check(){
        for(int i=0;i<string.length/2;i++){
            if(string[i]!=string[string.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
