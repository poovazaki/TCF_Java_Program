import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        int temp=0;
        while(sum>9) {
            temp+=sum%10;
            sum=sum/10;
            if (sum < 10) {
                temp += sum;
                break;
            }
        }
        
        System.out.println("Single digit sum is: " + temp);
        sc.close();
    }
    }

