import java.util.Scanner;

public class GreatestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();
        System.out.println("Enter c value:");
        int c=sc.nextInt();

       System.out.println((a==b && b==c)?"equal":(a>b && a>c)?"a is greatest":(b>a && b>c)?"b is greatest":"c is greatest");
        ;
            
        sc.close();
    }
    
}
