

public class alphacase {
    public static void main(String[] args) {
        String word="Madam";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        String s1="Madam  ";
        s1=s1.toLowerCase().trim();
        System.out.println(s1);
        StringBuffer sb = new StringBuffer(s1);
        String revrsed=sb.reverse().toString();
        if(s1.equals(revrsed)) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");


    }
}
}
