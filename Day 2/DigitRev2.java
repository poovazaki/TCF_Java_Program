import java.util.Scanner;

public class DigitRev2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter a 3 digit no.:");
        int n=sc.nextInt();
        int left=n/100;
        int middle=(n/10)%10;
        int right=n%10;
        int rev=right*100 + middle*10 + left;
        System.out.println(rev);
        sc.close(); 
    }
    
}
