public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello World";
        //to print the memory address of the string
        System.out.println(System.identityHashCode(str));
        String s1=new String("Hello World");
        System.out.println(System.identityHashCode(s1));
        // Count the number of vowels in the string
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
