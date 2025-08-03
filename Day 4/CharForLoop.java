public class CharForLoop {
    public static void main(String[] args) {
        String s="Hello World";
        for (int i=0;i<s.length();i++) {
            
            System.out.println(s.charAt(i));
        }
        String line="madam speaks malayalam very well said dad";
        String words[]=line.split(" ");
        System.out.println(words.length);
        for(String w:words){
            System.out.println(w);
        }


    }
}
