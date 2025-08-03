public class Pangram {
   
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase(); // Convert to lowercase

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                System.out.println("Not a Pangram");
                return;
            }
        }

        System.out.println("Pangram");
    }
} 


