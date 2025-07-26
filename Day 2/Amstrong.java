import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter a 3 digit no.:");
        int n=sc.nextInt();
        int left=n/100;
        int middle=(n/10)%10;
        int right=n%10;
        int res=left*left*left + middle*middle*middle + right*right*right;
        System.out.println((n==res) ? "is an Armstrong number." :"is not an Armstrong number.");
        // // if(n==res){
        //     System.out.println(n + " is an Armstrong number.");
        
        // }
        // else{
        //     System.out.println(n + " is not an Armstrong number.");
        // }
        sc.close(); 
    }
    
}
    

