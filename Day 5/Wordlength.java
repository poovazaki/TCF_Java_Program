

public class Wordlength {
    public static void main(String[] args) {
        String s ="abcd";
        String s1="";
        for(char ch:s.toCharArray()) {
            s1+=ch+s1;
        }
        System.out.println(s1);
    }
    
}
 