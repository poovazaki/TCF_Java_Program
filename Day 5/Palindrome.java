public class Palindrome{
    public static void main(String[] args) {
        String line="madam speaks malayalam very well said dad";
        String words[]=line.split(" ");
        for(String word: words) {
            
          
            StringBuffer sb = new StringBuffer(word);
            String reversed=sb.reverse().toString();
            if(word.equals(reversed)) {
                System.out.println(word + "' is a palindrome");
            } else {
                System.out.println( word + "' is not a palindrome");
            }
    }
    
}
}
