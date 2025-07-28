import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);  
       System.out.println("Enter a number");
       int n=sc.nextInt();
       int c=0;
       while(n>0){
        
        c=c+n%10;
        n=n/10;
       }
       System.out.println(c);
       sc.close();
    }
   


    
}
