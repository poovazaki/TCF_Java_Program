public class ReverseNumberFixed {
    public static void main(String[] args) {
        int num = 521;

       
        int d1 = num % 10;
        num = num / 10;

        int d2 = num % 10;
        num = num / 10;

        int d3 = num % 10;

        int reversed = d1 * 100 + d2 * 10 + d3 * 1;

        System.out.println("Reversed number: " + reversed);
    }
}
