public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("");
        System.out.println(sb.capacity());  //StringBuffer's initial capacity is 16. Which means it starts with a capacity of 16 characters.
        sb.append("a");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        sb.append("b");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        sb.append("c");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.length()); 
       
    }
}