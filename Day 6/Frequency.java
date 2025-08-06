import java.util.ArrayList;

public class Frequency {
    public static void main(String[] args) {
        String str="aaaabc";
        int freq[]=new int[26];
        ArrayList<Character> list = new ArrayList<>();
        for (char ch: str.toCharArray()) {
           freq[ch-97]++;
           if(!list.contains(ch)) 
                list.add(ch);
            }
            for(char ch: list) {
                
                System.out.println(ch + " : " + freq[ch - 97]);
        }

    }
}


