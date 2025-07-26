import java.util.Scanner;

public class DigitRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two digit number:");
        int n=sc.nextInt();
        int left=n/10;
        int right=n%10;
        int rev=right*10+left;
        System.out.println("n="+n);
        System.out.println("rev="+rev);
        sc.close();

    }
}
