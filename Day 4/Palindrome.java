public class Palindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(s);
        char ch[]=s.toCharArray();
        int i,j;
        for (i=0,j=ch.length-1;i<j;i++,j--) {
            if (ch[i] != ch[j] ){
                
                break;
            }
            }
        System.out.println("Not a palindrome");

       
    }
}


