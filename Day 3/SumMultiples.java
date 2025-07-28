import java.util.Scanner;
public class SumMultiples{
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                sum+=i;
    }
    
    }
        System.out.println("Sum of multiples of 3, 5, or 7 up to " + n + " is: " + sum);
    sc.close();
}
        
    
}
